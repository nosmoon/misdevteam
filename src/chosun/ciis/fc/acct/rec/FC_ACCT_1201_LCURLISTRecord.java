/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_1201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String abrv_nm;
	public String slip_clsf01;
	public String slip01;
	public String slip_clsf02;
	public String slip02;
	public String slip_clsf03;
	public String slip03;
	public String slip_clsf10;
	public String slip10;
	public String slip_clsf11;
	public String slip11;
	public String slip_clsf12;
	public String slip12;
	public String slip_clsf13;
	public String slip13;
	public String slip_clsf16;
	public String slip16;
	public String slip_clsf17;
	public String slip17;
	public String slip_clsf20;
	public String slip20;
	public String slip_clsf21;
	public String slip21;
	public String slip_clsf22;
	public String slip22;
	public String slip_clsf26;
	public String slip26;
	public String slip_clsf27;
	public String slip27;
	public String slip_clsf30;
	public String slip30;
	public String slip_clsf32;
	public String slip32;
	public String slip_clsf33;
	public String slip33;
	public String slip_clsf34;
	public String slip34;
	public String slip_clsf35;
	public String slip35;
	public String slip_clsf36;
	public String slip36;
	public String slip_clsf40;
	public String slip40;
	public String slip_clsf41;
	public String slip41;
	public String slip_clsf42;
	public String slip42;
	public String slip_clsf50;
	public String slip50;
	public String slip_clsf51;
	public String slip51;
	public String slip_clsf52;
	public String slip52;
	public String slip_clsf53;
	public String slip53;
	public String slip_clsf54;
	public String slip54;
	public String slip_clsf55;
	public String slip55;
	public String slip_clsf60;
	public String slip60;
	public String slip_clsf61;
	public String slip61;
	public String slip_clsf62;
	public String slip62;
	public String slip_clsf63;
	public String slip63;
	public String slip_clsf64;
	public String slip64;
	public String slip_clsf90;
	public String slip90;
	public String slip_clsf91;
	public String slip91;
	public String slip_clsf92;
	public String slip92;
	public String slip_clsf93;
	public String slip93;
	public String slip_clsf94;
	public String slip94;
	public String slip_clsf95;
	public String slip95;
	public String slip_clsf96;
	public String slip96;
	public String slip_clsf97;
	public String slip97;

	public FC_ACCT_1201_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public void setSlip_clsf01(String slip_clsf01){
		this.slip_clsf01 = slip_clsf01;
	}

	public void setSlip01(String slip01){
		this.slip01 = slip01;
	}

	public void setSlip_clsf02(String slip_clsf02){
		this.slip_clsf02 = slip_clsf02;
	}

	public void setSlip02(String slip02){
		this.slip02 = slip02;
	}

	public void setSlip_clsf03(String slip_clsf03){
		this.slip_clsf03 = slip_clsf03;
	}

	public void setSlip03(String slip03){
		this.slip03 = slip03;
	}

	public void setSlip_clsf10(String slip_clsf10){
		this.slip_clsf10 = slip_clsf10;
	}

	public void setSlip10(String slip10){
		this.slip10 = slip10;
	}

	public void setSlip_clsf11(String slip_clsf11){
		this.slip_clsf11 = slip_clsf11;
	}

	public void setSlip11(String slip11){
		this.slip11 = slip11;
	}

	public void setSlip_clsf12(String slip_clsf12){
		this.slip_clsf12 = slip_clsf12;
	}

	public void setSlip12(String slip12){
		this.slip12 = slip12;
	}

	public void setSlip_clsf13(String slip_clsf13){
		this.slip_clsf13 = slip_clsf13;
	}

	public void setSlip13(String slip13){
		this.slip13 = slip13;
	}

	public void setSlip_clsf16(String slip_clsf16){
		this.slip_clsf16 = slip_clsf16;
	}

	public void setSlip16(String slip16){
		this.slip16 = slip16;
	}

	public void setSlip_clsf17(String slip_clsf17){
		this.slip_clsf17 = slip_clsf17;
	}

	public void setSlip17(String slip17){
		this.slip17 = slip17;
	}

	public void setSlip_clsf20(String slip_clsf20){
		this.slip_clsf20 = slip_clsf20;
	}

	public void setSlip20(String slip20){
		this.slip20 = slip20;
	}

	public void setSlip_clsf21(String slip_clsf21){
		this.slip_clsf21 = slip_clsf21;
	}

	public void setSlip21(String slip21){
		this.slip21 = slip21;
	}

	public void setSlip_clsf22(String slip_clsf22){
		this.slip_clsf22 = slip_clsf22;
	}

	public void setSlip22(String slip22){
		this.slip22 = slip22;
	}

	public void setSlip_clsf26(String slip_clsf26){
		this.slip_clsf26 = slip_clsf26;
	}

	public void setSlip26(String slip26){
		this.slip26 = slip26;
	}

	public void setSlip_clsf27(String slip_clsf27){
		this.slip_clsf27 = slip_clsf27;
	}

	public void setSlip27(String slip27){
		this.slip27 = slip27;
	}

	public void setSlip_clsf30(String slip_clsf30){
		this.slip_clsf30 = slip_clsf30;
	}

	public void setSlip30(String slip30){
		this.slip30 = slip30;
	}

	public void setSlip_clsf32(String slip_clsf32){
		this.slip_clsf32 = slip_clsf32;
	}

	public void setSlip32(String slip32){
		this.slip32 = slip32;
	}

	public void setSlip_clsf33(String slip_clsf33){
		this.slip_clsf33 = slip_clsf33;
	}

	public void setSlip33(String slip33){
		this.slip33 = slip33;
	}

	public void setSlip_clsf34(String slip_clsf34){
		this.slip_clsf34 = slip_clsf34;
	}

	public void setSlip34(String slip34){
		this.slip34 = slip34;
	}

	public void setSlip_clsf35(String slip_clsf35){
		this.slip_clsf35 = slip_clsf35;
	}

	public void setSlip35(String slip35){
		this.slip35 = slip35;
	}

	public void setSlip_clsf36(String slip_clsf36){
		this.slip_clsf36 = slip_clsf36;
	}

	public void setSlip36(String slip36){
		this.slip36 = slip36;
	}

	public void setSlip_clsf40(String slip_clsf40){
		this.slip_clsf40 = slip_clsf40;
	}

	public void setSlip40(String slip40){
		this.slip40 = slip40;
	}

	public void setSlip_clsf41(String slip_clsf41){
		this.slip_clsf41 = slip_clsf41;
	}

	public void setSlip41(String slip41){
		this.slip41 = slip41;
	}

	public void setSlip_clsf42(String slip_clsf42){
		this.slip_clsf42 = slip_clsf42;
	}

	public void setSlip42(String slip42){
		this.slip42 = slip42;
	}

	public void setSlip_clsf50(String slip_clsf50){
		this.slip_clsf50 = slip_clsf50;
	}

	public void setSlip50(String slip50){
		this.slip50 = slip50;
	}

	public void setSlip_clsf51(String slip_clsf51){
		this.slip_clsf51 = slip_clsf51;
	}

	public void setSlip51(String slip51){
		this.slip51 = slip51;
	}

	public void setSlip_clsf52(String slip_clsf52){
		this.slip_clsf52 = slip_clsf52;
	}

	public void setSlip52(String slip52){
		this.slip52 = slip52;
	}

	public void setSlip_clsf53(String slip_clsf53){
		this.slip_clsf53 = slip_clsf53;
	}

	public void setSlip53(String slip53){
		this.slip53 = slip53;
	}

	public void setSlip_clsf54(String slip_clsf54){
		this.slip_clsf54 = slip_clsf54;
	}

	public void setSlip54(String slip54){
		this.slip54 = slip54;
	}

	public void setSlip_clsf55(String slip_clsf55){
		this.slip_clsf55 = slip_clsf55;
	}

	public void setSlip55(String slip55){
		this.slip55 = slip55;
	}

	public void setSlip_clsf60(String slip_clsf60){
		this.slip_clsf60 = slip_clsf60;
	}

	public void setSlip60(String slip60){
		this.slip60 = slip60;
	}

	public void setSlip_clsf61(String slip_clsf61){
		this.slip_clsf61 = slip_clsf61;
	}

	public void setSlip61(String slip61){
		this.slip61 = slip61;
	}

	public void setSlip_clsf62(String slip_clsf62){
		this.slip_clsf62 = slip_clsf62;
	}

	public void setSlip62(String slip62){
		this.slip62 = slip62;
	}

	public void setSlip_clsf63(String slip_clsf63){
		this.slip_clsf63 = slip_clsf63;
	}

	public void setSlip63(String slip63){
		this.slip63 = slip63;
	}

	public void setSlip_clsf64(String slip_clsf64){
		this.slip_clsf64 = slip_clsf64;
	}

	public void setSlip64(String slip64){
		this.slip64 = slip64;
	}

	public void setSlip_clsf90(String slip_clsf90){
		this.slip_clsf90 = slip_clsf90;
	}

	public void setSlip90(String slip90){
		this.slip90 = slip90;
	}

	public void setSlip_clsf91(String slip_clsf91){
		this.slip_clsf91 = slip_clsf91;
	}

	public void setSlip91(String slip91){
		this.slip91 = slip91;
	}

	public void setSlip_clsf92(String slip_clsf92){
		this.slip_clsf92 = slip_clsf92;
	}

	public void setSlip92(String slip92){
		this.slip92 = slip92;
	}

	public void setSlip_clsf93(String slip_clsf93){
		this.slip_clsf93 = slip_clsf93;
	}

	public void setSlip93(String slip93){
		this.slip93 = slip93;
	}

	public void setSlip_clsf94(String slip_clsf94){
		this.slip_clsf94 = slip_clsf94;
	}

	public void setSlip94(String slip94){
		this.slip94 = slip94;
	}

	public void setSlip_clsf95(String slip_clsf95){
		this.slip_clsf95 = slip_clsf95;
	}

	public void setSlip95(String slip95){
		this.slip95 = slip95;
	}

	public void setSlip_clsf96(String slip_clsf96){
		this.slip_clsf96 = slip_clsf96;
	}

	public void setSlip96(String slip96){
		this.slip96 = slip96;
	}

	public void setSlip_clsf97(String slip_clsf97){
		this.slip_clsf97 = slip_clsf97;
	}

	public void setSlip97(String slip97){
		this.slip97 = slip97;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}

	public String getSlip_clsf01(){
		return this.slip_clsf01;
	}

	public String getSlip01(){
		return this.slip01;
	}

	public String getSlip_clsf02(){
		return this.slip_clsf02;
	}

	public String getSlip02(){
		return this.slip02;
	}

	public String getSlip_clsf03(){
		return this.slip_clsf03;
	}

	public String getSlip03(){
		return this.slip03;
	}

	public String getSlip_clsf10(){
		return this.slip_clsf10;
	}

	public String getSlip10(){
		return this.slip10;
	}

	public String getSlip_clsf11(){
		return this.slip_clsf11;
	}

	public String getSlip11(){
		return this.slip11;
	}

	public String getSlip_clsf12(){
		return this.slip_clsf12;
	}

	public String getSlip12(){
		return this.slip12;
	}

	public String getSlip_clsf13(){
		return this.slip_clsf13;
	}

	public String getSlip13(){
		return this.slip13;
	}

	public String getSlip_clsf16(){
		return this.slip_clsf16;
	}

	public String getSlip16(){
		return this.slip16;
	}

	public String getSlip_clsf17(){
		return this.slip_clsf17;
	}

	public String getSlip17(){
		return this.slip17;
	}

	public String getSlip_clsf20(){
		return this.slip_clsf20;
	}

	public String getSlip20(){
		return this.slip20;
	}

	public String getSlip_clsf21(){
		return this.slip_clsf21;
	}

	public String getSlip21(){
		return this.slip21;
	}

	public String getSlip_clsf22(){
		return this.slip_clsf22;
	}

	public String getSlip22(){
		return this.slip22;
	}

	public String getSlip_clsf26(){
		return this.slip_clsf26;
	}

	public String getSlip26(){
		return this.slip26;
	}

	public String getSlip_clsf27(){
		return this.slip_clsf27;
	}

	public String getSlip27(){
		return this.slip27;
	}

	public String getSlip_clsf30(){
		return this.slip_clsf30;
	}

	public String getSlip30(){
		return this.slip30;
	}

	public String getSlip_clsf32(){
		return this.slip_clsf32;
	}

	public String getSlip32(){
		return this.slip32;
	}

	public String getSlip_clsf33(){
		return this.slip_clsf33;
	}

	public String getSlip33(){
		return this.slip33;
	}

	public String getSlip_clsf34(){
		return this.slip_clsf34;
	}

	public String getSlip34(){
		return this.slip34;
	}

	public String getSlip_clsf35(){
		return this.slip_clsf35;
	}

	public String getSlip35(){
		return this.slip35;
	}

	public String getSlip_clsf36(){
		return this.slip_clsf36;
	}

	public String getSlip36(){
		return this.slip36;
	}

	public String getSlip_clsf40(){
		return this.slip_clsf40;
	}

	public String getSlip40(){
		return this.slip40;
	}

	public String getSlip_clsf41(){
		return this.slip_clsf41;
	}

	public String getSlip41(){
		return this.slip41;
	}

	public String getSlip_clsf42(){
		return this.slip_clsf42;
	}

	public String getSlip42(){
		return this.slip42;
	}

	public String getSlip_clsf50(){
		return this.slip_clsf50;
	}

	public String getSlip50(){
		return this.slip50;
	}

	public String getSlip_clsf51(){
		return this.slip_clsf51;
	}

	public String getSlip51(){
		return this.slip51;
	}

	public String getSlip_clsf52(){
		return this.slip_clsf52;
	}

	public String getSlip52(){
		return this.slip52;
	}

	public String getSlip_clsf53(){
		return this.slip_clsf53;
	}

	public String getSlip53(){
		return this.slip53;
	}

	public String getSlip_clsf54(){
		return this.slip_clsf54;
	}

	public String getSlip54(){
		return this.slip54;
	}

	public String getSlip_clsf55(){
		return this.slip_clsf55;
	}

	public String getSlip55(){
		return this.slip55;
	}

	public String getSlip_clsf60(){
		return this.slip_clsf60;
	}

	public String getSlip60(){
		return this.slip60;
	}

	public String getSlip_clsf61(){
		return this.slip_clsf61;
	}

	public String getSlip61(){
		return this.slip61;
	}

	public String getSlip_clsf62(){
		return this.slip_clsf62;
	}

	public String getSlip62(){
		return this.slip62;
	}

	public String getSlip_clsf63(){
		return this.slip_clsf63;
	}

	public String getSlip63(){
		return this.slip63;
	}

	public String getSlip_clsf64(){
		return this.slip_clsf64;
	}

	public String getSlip64(){
		return this.slip64;
	}

	public String getSlip_clsf90(){
		return this.slip_clsf90;
	}

	public String getSlip90(){
		return this.slip90;
	}

	public String getSlip_clsf91(){
		return this.slip_clsf91;
	}

	public String getSlip91(){
		return this.slip91;
	}

	public String getSlip_clsf92(){
		return this.slip_clsf92;
	}

	public String getSlip92(){
		return this.slip92;
	}

	public String getSlip_clsf93(){
		return this.slip_clsf93;
	}

	public String getSlip93(){
		return this.slip93;
	}

	public String getSlip_clsf94(){
		return this.slip_clsf94;
	}

	public String getSlip94(){
		return this.slip94;
	}

	public String getSlip_clsf95(){
		return this.slip_clsf95;
	}

	public String getSlip95(){
		return this.slip95;
	}

	public String getSlip_clsf96(){
		return this.slip_clsf96;
	}

	public String getSlip96(){
		return this.slip96;
	}

	public String getSlip_clsf97(){
		return this.slip_clsf97;
	}

	public String getSlip97(){
		return this.slip97;
	}
}

/* 작성시간 : Mon Apr 20 18:11:10 KST 2009 */