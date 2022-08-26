#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_example_bazar1177s_network_Server_getDevelopment(JNIEnv *env, jobject thiz) {
    return (*env)->  NewStringUTF(env, "http://92.63.206.99:8080/");
}

JNIEXPORT jstring JNICALL
Java_com_example_bazar1177s_network_Server_getProduction(JNIEnv *env, jobject thiz) {
    return (*env)->NewStringUTF(env, "http://92.63.206.99:8080/");
}