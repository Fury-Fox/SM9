/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package mcl.bn254;

public class BN254JNI {
  public final static native void SystemInit();
  public final static native long new_Mpz__SWIG_0();
  public final static native long new_Mpz__SWIG_1(long jarg1, Mpz jarg1_);
  public final static native long new_Mpz__SWIG_2(int jarg1);
  public final static native long new_Mpz__SWIG_3(String jarg1);
  public final static native void Mpz_set__SWIG_0(long jarg1, Mpz jarg1_, int jarg2);
  public final static native void Mpz_set__SWIG_1(long jarg1, Mpz jarg1_, String jarg2);
  public final static native String Mpz_toString(long jarg1, Mpz jarg1_);
  public final static native boolean Mpz_equals(long jarg1, Mpz jarg1_, long jarg2, Mpz jarg2_);
  public final static native int Mpz_compareTo(long jarg1, Mpz jarg1_, long jarg2, Mpz jarg2_);
  public final static native void Mpz_add(long jarg1, Mpz jarg1_, long jarg2, Mpz jarg2_);
  public final static native void Mpz_sub(long jarg1, Mpz jarg1_, long jarg2, Mpz jarg2_);
  public final static native void Mpz_mul(long jarg1, Mpz jarg1_, long jarg2, Mpz jarg2_);
  public final static native void Mpz_mod(long jarg1, Mpz jarg1_, long jarg2, Mpz jarg2_);
  public final static native void delete_Mpz(long jarg1);
  public final static native long new_Fp__SWIG_0();
  public final static native long new_Fp__SWIG_1(long jarg1, Fp jarg1_);
  public final static native long new_Fp__SWIG_2(int jarg1);
  public final static native long new_Fp__SWIG_3(String jarg1);
  public final static native void Fp_set__SWIG_0(long jarg1, Fp jarg1_, int jarg2);
  public final static native void Fp_set__SWIG_1(long jarg1, Fp jarg1_, String jarg2);
  public final static native String Fp_toString(long jarg1, Fp jarg1_);
  public final static native boolean Fp_equals(long jarg1, Fp jarg1_, long jarg2, Fp jarg2_);
  public final static native void Fp_add(long jarg1, Fp jarg1_, long jarg2, Fp jarg2_);
  public final static native void Fp_sub(long jarg1, Fp jarg1_, long jarg2, Fp jarg2_);
  public final static native void Fp_mul(long jarg1, Fp jarg1_, long jarg2, Fp jarg2_);
  public final static native void Fp_power(long jarg1, Fp jarg1_, long jarg2, Mpz jarg2_);
  public final static native void delete_Fp(long jarg1);
  public final static native long new_Fp2__SWIG_0();
  public final static native long new_Fp2__SWIG_1(long jarg1, Fp2 jarg1_);
  public final static native long new_Fp2__SWIG_2(int jarg1);
  public final static native long new_Fp2__SWIG_3(int jarg1, int jarg2);
  public final static native long new_Fp2__SWIG_4(long jarg1, Fp jarg1_, long jarg2, Fp jarg2_);
  public final static native long new_Fp2__SWIG_5(String jarg1, String jarg2);
  public final static native long Fp2_getA(long jarg1, Fp2 jarg1_);
  public final static native long Fp2_getB(long jarg1, Fp2 jarg1_);
  public final static native void Fp2_set(long jarg1, Fp2 jarg1_, String jarg2);
  public final static native String Fp2_toString(long jarg1, Fp2 jarg1_);
  public final static native boolean Fp2_equals(long jarg1, Fp2 jarg1_, long jarg2, Fp2 jarg2_);
  public final static native void Fp2_add(long jarg1, Fp2 jarg1_, long jarg2, Fp2 jarg2_);
  public final static native void Fp2_sub(long jarg1, Fp2 jarg1_, long jarg2, Fp2 jarg2_);
  public final static native void Fp2_mul(long jarg1, Fp2 jarg1_, long jarg2, Fp2 jarg2_);
  public final static native void Fp2_power(long jarg1, Fp2 jarg1_, long jarg2, Mpz jarg2_);
  public final static native void delete_Fp2(long jarg1);
  public final static native long new_Fp12__SWIG_0();
  public final static native long new_Fp12__SWIG_1(long jarg1, Fp12 jarg1_);
  public final static native long new_Fp12__SWIG_2(int jarg1);
  public final static native void Fp12_set(long jarg1, Fp12 jarg1_, String jarg2);
  public final static native String Fp12_toString(long jarg1, Fp12 jarg1_);
  public final static native boolean Fp12_equals(long jarg1, Fp12 jarg1_, long jarg2, Fp12 jarg2_);
  public final static native void Fp12_add(long jarg1, Fp12 jarg1_, long jarg2, Fp12 jarg2_);
  public final static native void Fp12_sub(long jarg1, Fp12 jarg1_, long jarg2, Fp12 jarg2_);
  public final static native void Fp12_mul(long jarg1, Fp12 jarg1_, long jarg2, Fp12 jarg2_);
  public final static native void Fp12_pairing(long jarg1, Fp12 jarg1_, long jarg2, Ec2 jarg2_, long jarg3, Ec1 jarg3_);
  public final static native void Fp12_power(long jarg1, Fp12 jarg1_, long jarg2, Mpz jarg2_);
  public final static native void delete_Fp12(long jarg1);
  public final static native long new_Ec1__SWIG_0();
  public final static native long new_Ec1__SWIG_1(long jarg1, Ec1 jarg1_);
  public final static native long new_Ec1__SWIG_2(long jarg1, Fp jarg1_, long jarg2, Fp jarg2_);
  public final static native long new_Ec1__SWIG_3(long jarg1, Fp jarg1_, long jarg2, Fp jarg2_, long jarg3, Fp jarg3_);
  public final static native boolean Ec1_isValid(long jarg1, Ec1 jarg1_);
  public final static native void Ec1_set__SWIG_0(long jarg1, Ec1 jarg1_, long jarg2, Fp jarg2_, long jarg3, Fp jarg3_);
  public final static native void Ec1_set__SWIG_1(long jarg1, Ec1 jarg1_, long jarg2, Fp jarg2_, long jarg3, Fp jarg3_, long jarg4, Fp jarg4_);
  public final static native void Ec1_set__SWIG_2(long jarg1, Ec1 jarg1_, String jarg2);
  public final static native String Ec1_toString(long jarg1, Ec1 jarg1_);
  public final static native boolean Ec1_equals(long jarg1, Ec1 jarg1_, long jarg2, Ec1 jarg2_);
  public final static native boolean Ec1_isZero(long jarg1, Ec1 jarg1_);
  public final static native void Ec1_clear(long jarg1, Ec1 jarg1_);
  public final static native void Ec1_dbl(long jarg1, Ec1 jarg1_);
  public final static native void Ec1_neg(long jarg1, Ec1 jarg1_);
  public final static native void Ec1_add(long jarg1, Ec1 jarg1_, long jarg2, Ec1 jarg2_);
  public final static native void Ec1_sub(long jarg1, Ec1 jarg1_, long jarg2, Ec1 jarg2_);
  public final static native void Ec1_mul(long jarg1, Ec1 jarg1_, long jarg2, Mpz jarg2_);
  public final static native long Ec1_getX(long jarg1, Ec1 jarg1_);
  public final static native long Ec1_getY(long jarg1, Ec1 jarg1_);
  public final static native long Ec1_getZ(long jarg1, Ec1 jarg1_);
  public final static native void delete_Ec1(long jarg1);
  public final static native long new_Ec2__SWIG_0();
  public final static native long new_Ec2__SWIG_1(long jarg1, Ec2 jarg1_);
  public final static native long new_Ec2__SWIG_2(long jarg1, Fp2 jarg1_, long jarg2, Fp2 jarg2_);
  public final static native long new_Ec2__SWIG_3(long jarg1, Fp2 jarg1_, long jarg2, Fp2 jarg2_, long jarg3, Fp2 jarg3_);
  public final static native boolean Ec2_isValid(long jarg1, Ec2 jarg1_);
  public final static native void Ec2_set__SWIG_0(long jarg1, Ec2 jarg1_, long jarg2, Fp2 jarg2_, long jarg3, Fp2 jarg3_);
  public final static native void Ec2_set__SWIG_1(long jarg1, Ec2 jarg1_, long jarg2, Fp2 jarg2_, long jarg3, Fp2 jarg3_, long jarg4, Fp2 jarg4_);
  public final static native void Ec2_set__SWIG_2(long jarg1, Ec2 jarg1_, String jarg2);
  public final static native String Ec2_toString(long jarg1, Ec2 jarg1_);
  public final static native boolean Ec2_equals(long jarg1, Ec2 jarg1_, long jarg2, Ec2 jarg2_);
  public final static native boolean Ec2_isZero(long jarg1, Ec2 jarg1_);
  public final static native void Ec2_clear(long jarg1, Ec2 jarg1_);
  public final static native void Ec2_dbl(long jarg1, Ec2 jarg1_);
  public final static native void Ec2_neg(long jarg1, Ec2 jarg1_);
  public final static native void Ec2_add(long jarg1, Ec2 jarg1_, long jarg2, Ec2 jarg2_);
  public final static native void Ec2_sub(long jarg1, Ec2 jarg1_, long jarg2, Ec2 jarg2_);
  public final static native void Ec2_mul(long jarg1, Ec2 jarg1_, long jarg2, Mpz jarg2_);
  public final static native long Ec2_getX(long jarg1, Ec2 jarg1_);
  public final static native long Ec2_getY(long jarg1, Ec2 jarg1_);
  public final static native long Ec2_getZ(long jarg1, Ec2 jarg1_);
  public final static native void delete_Ec2(long jarg1);
  public final static native long GetParamR();
}