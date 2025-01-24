#include <jni.h>
#include "med_voll_api_testes_memoria_TestaPC.h"

JNIEXPORT jint JNICALL Java_med_voll_api_testes_memoria_TestaPC_soma(JNIEnv *env, jclass cls, jint valor1, jint valor2) {
    return valor1 + valor2;
}
