package org.codearena;

import org.codearena.annnotations.ProblemMetadata;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.*;

public class IndexGenerator {

    static String baseRepoUrl = "https://github.com/yourusername/yourrepo/blob/main/";
    static String sourceRootPath = "src/main/java/";

    public static void main(String[] args) throws Exception {
        String basePackage = "org.codearena";
        List<Class<?>> classes = getClasses(basePackage);

        try (FileWriter writer = new FileWriter("index.md")) {
            writer.write("# Coding Arena Problem Index\n\n");
            writer.write("| Title | Class | Difficulty | Tags |Problem Id\n");
            writer.write("|-------|-------|------|------------|---------|\n");

            for (Class<?> cls : classes) {
                ProblemMetadata metadata = cls.getAnnotation(ProblemMetadata.class);
                if (metadata != null) {
                    String title = metadata.title().isEmpty() ? cls.getSimpleName() : metadata.title();
                    String tags = String.join(", ", metadata.tags());
                    String link = metadata.link().isEmpty()? "" : metadata.link();
                    String problemId = metadata.problemId().isEmpty()? "-1" : metadata.problemId();
                    String className = cls.getSimpleName();
                    String filePath = cls.getName().replace('.', '/') + ".java";
                    String githubLink = baseRepoUrl + sourceRootPath + filePath;
                    writer.write(String.format("| [%s](%s) | [%s](%s) | %s | %s |%s |\n",
                            title,
                            metadata.link(),                          // LeetCode URL
                            className + ".java", githubLink,         // Class filename and link
                            metadata.difficulty(),
                            tags,
                            problemId));

                }
            }

            System.out.println("✅ index.md generated!");
        }
    }

    // This utility loads all classes from the package
    private static List<Class<?>> getClasses(String packageName) throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = classLoader.getResources(path);
        List<String> classNames = new ArrayList<>();
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            File directory = new File(resource.getFile());
            for (String file : Objects.requireNonNull(directory.list())) {
                if (file.endsWith(".class")) {
                    classNames.add(packageName + "." + file.replace(".class", ""));
                }
            }
        }

        List<Class<?>> classes = new ArrayList<>();
        for (String className : classNames) {
            classes.add(Class.forName(className));
        }
        return classes;
    }
}
