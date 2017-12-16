package com.github.hykes.codegen.file.filetype;

import com.intellij.icons.AllIcons;
import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class KotlinFileType extends LanguageFileType {

    @NonNls
    public static final String DEFAULT_EXTENSION = "kt";
    @NonNls
    public static final String DOT_DEFAULT_EXTENSION = ".kt";
    public static final KotlinFileType INSTANCE = new KotlinFileType();

    private KotlinFileType() {
        super(JavaLanguage.INSTANCE);
    }

    @Override
    @NotNull
    public String getName() {
        return "KOTLIN";
    }

    @Override
    @NotNull
    public String getDescription() {
        return "Kotlin files";
    }

    @Override
    @NotNull
    public String getDefaultExtension() {
        return "kt";
    }

    @Override
    public Icon getIcon() {
        return AllIcons.FileTypes.Any_type;
    }

}
