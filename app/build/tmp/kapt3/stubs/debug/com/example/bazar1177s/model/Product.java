package com.example.bazar1177s.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\nH\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\rH\u00c6\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006)"}, d2 = {"Lcom/example/bazar1177s/model/Product;", "", "id", "", "name", "", "price", "type", "Lcom/example/bazar1177s/model/Type;", "category", "Lcom/example/bazar1177s/model/Category;", "about", "image", "Lcom/example/bazar1177s/model/Image;", "(JLjava/lang/String;JLcom/example/bazar1177s/model/Type;Lcom/example/bazar1177s/model/Category;Ljava/lang/String;Lcom/example/bazar1177s/model/Image;)V", "getAbout", "()Ljava/lang/String;", "getCategory", "()Lcom/example/bazar1177s/model/Category;", "getId", "()J", "getImage", "()Lcom/example/bazar1177s/model/Image;", "getName", "getPrice", "getType", "()Lcom/example/bazar1177s/model/Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Product {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final long price = 0L;
    @org.jetbrains.annotations.NotNull()
    private final com.example.bazar1177s.model.Type type = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.bazar1177s.model.Category category = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String about = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.bazar1177s.model.Image image = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bazar1177s.model.Product copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, long price, @org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.model.Type type, @org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.model.Category category, @org.jetbrains.annotations.NotNull()
    java.lang.String about, @org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.model.Image image) {
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
    
    public Product(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, long price, @org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.model.Type type, @org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.model.Category category, @org.jetbrains.annotations.NotNull()
    java.lang.String about, @org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.model.Image image) {
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
    
    public final long getPrice() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bazar1177s.model.Type component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bazar1177s.model.Type getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bazar1177s.model.Category component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bazar1177s.model.Category getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAbout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bazar1177s.model.Image component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bazar1177s.model.Image getImage() {
        return null;
    }
}