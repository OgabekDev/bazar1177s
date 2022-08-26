package com.example.bazar1177s.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJN\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\'"}, d2 = {"Lcom/example/bazar1177s/model/Category;", "", "id", "", "name", "", "serialNumber", "image", "Lcom/example/bazar1177s/model/Image;", "shop", "Lcom/example/bazar1177s/model/ShopCategory;", "content", "", "(JLjava/lang/String;JLcom/example/bazar1177s/model/Image;Lcom/example/bazar1177s/model/ShopCategory;Ljava/lang/Boolean;)V", "getContent", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "()J", "getImage", "()Lcom/example/bazar1177s/model/Image;", "getName", "()Ljava/lang/String;", "getSerialNumber", "getShop", "()Lcom/example/bazar1177s/model/ShopCategory;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLjava/lang/String;JLcom/example/bazar1177s/model/Image;Lcom/example/bazar1177s/model/ShopCategory;Ljava/lang/Boolean;)Lcom/example/bazar1177s/model/Category;", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class Category {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final long serialNumber = 0L;
    @org.jetbrains.annotations.NotNull()
    private final com.example.bazar1177s.model.Image image = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.bazar1177s.model.ShopCategory shop = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean content = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bazar1177s.model.Category copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, long serialNumber, @org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.model.Image image, @org.jetbrains.annotations.Nullable()
    com.example.bazar1177s.model.ShopCategory shop, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean content) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Category(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, long serialNumber, @org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.model.Image image, @org.jetbrains.annotations.Nullable()
    com.example.bazar1177s.model.ShopCategory shop, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean content) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getSerialNumber() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bazar1177s.model.Image component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bazar1177s.model.Image getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.bazar1177s.model.ShopCategory component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.bazar1177s.model.ShopCategory getShop() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getContent() {
        return null;
    }
}