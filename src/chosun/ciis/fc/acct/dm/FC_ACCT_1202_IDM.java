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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1202_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
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
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_1202_IDM(){}
	public FC_ACCT_1202_IDM(String mode, String cmpy_cd, String dept_cd, String abrv_nm, String slip_clsf01, String slip01, String slip_clsf02, String slip02, String slip_clsf03, String slip03, String slip_clsf10, String slip10, String slip_clsf11, String slip11, String slip_clsf12, String slip12, String slip_clsf13, String slip13, String slip_clsf16, String slip16, String slip_clsf17, String slip17, String slip_clsf20, String slip20, String slip_clsf21, String slip21, String slip_clsf22, String slip22, String slip_clsf26, String slip26, String slip_clsf27, String slip27, String slip_clsf30, String slip30, String slip_clsf32, String slip32, String slip_clsf33, String slip33, String slip_clsf34, String slip34, String slip_clsf35, String slip35, String slip_clsf36, String slip36, String slip_clsf40, String slip40, String slip_clsf41, String slip41, String slip_clsf42, String slip42, String slip_clsf50, String slip50, String slip_clsf51, String slip51, String slip_clsf52, String slip52, String slip_clsf53, String slip53, String slip_clsf54, String slip54, String slip_clsf55, String slip55, String slip_clsf60, String slip60, String slip_clsf61, String slip61, String slip_clsf62, String slip62, String slip_clsf63, String slip63, String slip_clsf64, String slip64, String slip_clsf90, String slip90, String slip_clsf91, String slip91, String slip_clsf92, String slip92, String slip_clsf93, String slip93, String slip_clsf94, String slip94, String slip_clsf95, String slip95, String slip_clsf96, String slip96, String slip_clsf97, String slip97, String incmg_pers, String incmg_pers_ipadd){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.abrv_nm = abrv_nm;
		this.slip_clsf01 = slip_clsf01;
		this.slip01 = slip01;
		this.slip_clsf02 = slip_clsf02;
		this.slip02 = slip02;
		this.slip_clsf03 = slip_clsf03;
		this.slip03 = slip03;
		this.slip_clsf10 = slip_clsf10;
		this.slip10 = slip10;
		this.slip_clsf11 = slip_clsf11;
		this.slip11 = slip11;
		this.slip_clsf12 = slip_clsf12;
		this.slip12 = slip12;
		this.slip_clsf13 = slip_clsf13;
		this.slip13 = slip13;
		this.slip_clsf16 = slip_clsf16;
		this.slip16 = slip16;
		this.slip_clsf17 = slip_clsf17;
		this.slip17 = slip17;
		this.slip_clsf20 = slip_clsf20;
		this.slip20 = slip20;
		this.slip_clsf21 = slip_clsf21;
		this.slip21 = slip21;
		this.slip_clsf22 = slip_clsf22;
		this.slip22 = slip22;
		this.slip_clsf26 = slip_clsf26;
		this.slip26 = slip26;
		this.slip_clsf27 = slip_clsf27;
		this.slip27 = slip27;
		this.slip_clsf30 = slip_clsf30;
		this.slip30 = slip30;
		this.slip_clsf32 = slip_clsf32;
		this.slip32 = slip32;
		this.slip_clsf33 = slip_clsf33;
		this.slip33 = slip33;
		this.slip_clsf34 = slip_clsf34;
		this.slip34 = slip34;
		this.slip_clsf35 = slip_clsf35;
		this.slip35 = slip35;
		this.slip_clsf36 = slip_clsf36;
		this.slip36 = slip36;
		this.slip_clsf40 = slip_clsf40;
		this.slip40 = slip40;
		this.slip_clsf41 = slip_clsf41;
		this.slip41 = slip41;
		this.slip_clsf42 = slip_clsf42;
		this.slip42 = slip42;
		this.slip_clsf50 = slip_clsf50;
		this.slip50 = slip50;
		this.slip_clsf51 = slip_clsf51;
		this.slip51 = slip51;
		this.slip_clsf52 = slip_clsf52;
		this.slip52 = slip52;
		this.slip_clsf53 = slip_clsf53;
		this.slip53 = slip53;
		this.slip_clsf54 = slip_clsf54;
		this.slip54 = slip54;
		this.slip_clsf55 = slip_clsf55;
		this.slip55 = slip55;
		this.slip_clsf60 = slip_clsf60;
		this.slip60 = slip60;
		this.slip_clsf61 = slip_clsf61;
		this.slip61 = slip61;
		this.slip_clsf62 = slip_clsf62;
		this.slip62 = slip62;
		this.slip_clsf63 = slip_clsf63;
		this.slip63 = slip63;
		this.slip_clsf64 = slip_clsf64;
		this.slip64 = slip64;
		this.slip_clsf90 = slip_clsf90;
		this.slip90 = slip90;
		this.slip_clsf91 = slip_clsf91;
		this.slip91 = slip91;
		this.slip_clsf92 = slip_clsf92;
		this.slip92 = slip92;
		this.slip_clsf93 = slip_clsf93;
		this.slip93 = slip93;
		this.slip_clsf94 = slip_clsf94;
		this.slip94 = slip94;
		this.slip_clsf95 = slip_clsf95;
		this.slip95 = slip95;
		this.slip_clsf96 = slip_clsf96;
		this.slip96 = slip96;
		this.slip_clsf97 = slip_clsf97;
		this.slip97 = slip97;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

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

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1202_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1202_IDM dm = (FC_ACCT_1202_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.abrv_nm);
		cstmt.setString(7, dm.slip_clsf01);
		cstmt.setString(8, dm.slip01);
		cstmt.setString(9, dm.slip_clsf02);
		cstmt.setString(10, dm.slip02);
		cstmt.setString(11, dm.slip_clsf03);
		cstmt.setString(12, dm.slip03);
		cstmt.setString(13, dm.slip_clsf10);
		cstmt.setString(14, dm.slip10);
		cstmt.setString(15, dm.slip_clsf11);
		cstmt.setString(16, dm.slip11);
		cstmt.setString(17, dm.slip_clsf12);
		cstmt.setString(18, dm.slip12);
		cstmt.setString(19, dm.slip_clsf13);
		cstmt.setString(20, dm.slip13);
		cstmt.setString(21, dm.slip_clsf16);
		cstmt.setString(22, dm.slip16);
		cstmt.setString(23, dm.slip_clsf17);
		cstmt.setString(24, dm.slip17);
		cstmt.setString(25, dm.slip_clsf20);
		cstmt.setString(26, dm.slip20);
		cstmt.setString(27, dm.slip_clsf21);
		cstmt.setString(28, dm.slip21);
		cstmt.setString(29, dm.slip_clsf22);
		cstmt.setString(30, dm.slip22);
		cstmt.setString(31, dm.slip_clsf26);
		cstmt.setString(32, dm.slip26);
		cstmt.setString(33, dm.slip_clsf27);
		cstmt.setString(34, dm.slip27);
		cstmt.setString(35, dm.slip_clsf30);
		cstmt.setString(36, dm.slip30);
		cstmt.setString(37, dm.slip_clsf32);
		cstmt.setString(38, dm.slip32);
		cstmt.setString(39, dm.slip_clsf33);
		cstmt.setString(40, dm.slip33);
		cstmt.setString(41, dm.slip_clsf34);
		cstmt.setString(42, dm.slip34);
		cstmt.setString(43, dm.slip_clsf35);
		cstmt.setString(44, dm.slip35);
		cstmt.setString(45, dm.slip_clsf36);
		cstmt.setString(46, dm.slip36);
		cstmt.setString(47, dm.slip_clsf40);
		cstmt.setString(48, dm.slip40);
		cstmt.setString(49, dm.slip_clsf41);
		cstmt.setString(50, dm.slip41);
		cstmt.setString(51, dm.slip_clsf42);
		cstmt.setString(52, dm.slip42);
		cstmt.setString(53, dm.slip_clsf50);
		cstmt.setString(54, dm.slip50);
		cstmt.setString(55, dm.slip_clsf51);
		cstmt.setString(56, dm.slip51);
		cstmt.setString(57, dm.slip_clsf52);
		cstmt.setString(58, dm.slip52);
		cstmt.setString(59, dm.slip_clsf53);
		cstmt.setString(60, dm.slip53);
		cstmt.setString(61, dm.slip_clsf54);
		cstmt.setString(62, dm.slip54);
		cstmt.setString(63, dm.slip_clsf55);
		cstmt.setString(64, dm.slip55);
		cstmt.setString(65, dm.slip_clsf60);
		cstmt.setString(66, dm.slip60);
		cstmt.setString(67, dm.slip_clsf61);
		cstmt.setString(68, dm.slip61);
		cstmt.setString(69, dm.slip_clsf62);
		cstmt.setString(70, dm.slip62);
		cstmt.setString(71, dm.slip_clsf63);
		cstmt.setString(72, dm.slip63);
		cstmt.setString(73, dm.slip_clsf64);
		cstmt.setString(74, dm.slip64);
		cstmt.setString(75, dm.slip_clsf90);
		cstmt.setString(76, dm.slip90);
		cstmt.setString(77, dm.slip_clsf91);
		cstmt.setString(78, dm.slip91);
		cstmt.setString(79, dm.slip_clsf92);
		cstmt.setString(80, dm.slip92);
		cstmt.setString(81, dm.slip_clsf93);
		cstmt.setString(82, dm.slip93);
		cstmt.setString(83, dm.slip_clsf94);
		cstmt.setString(84, dm.slip94);
		cstmt.setString(85, dm.slip_clsf95);
		cstmt.setString(86, dm.slip95);
		cstmt.setString(87, dm.slip_clsf96);
		cstmt.setString(88, dm.slip96);
		cstmt.setString(89, dm.slip_clsf97);
		cstmt.setString(90, dm.slip97);
		cstmt.setString(91, dm.incmg_pers);
		cstmt.setString(92, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1202_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("abrv_nm = [" + getAbrv_nm() + "]");
		System.out.println("slip_clsf01 = [" + getSlip_clsf01() + "]");
		System.out.println("slip01 = [" + getSlip01() + "]");
		System.out.println("slip_clsf02 = [" + getSlip_clsf02() + "]");
		System.out.println("slip02 = [" + getSlip02() + "]");
		System.out.println("slip_clsf03 = [" + getSlip_clsf03() + "]");
		System.out.println("slip03 = [" + getSlip03() + "]");
		System.out.println("slip_clsf10 = [" + getSlip_clsf10() + "]");
		System.out.println("slip10 = [" + getSlip10() + "]");
		System.out.println("slip_clsf11 = [" + getSlip_clsf11() + "]");
		System.out.println("slip11 = [" + getSlip11() + "]");
		System.out.println("slip_clsf12 = [" + getSlip_clsf12() + "]");
		System.out.println("slip12 = [" + getSlip12() + "]");
		System.out.println("slip_clsf13 = [" + getSlip_clsf13() + "]");
		System.out.println("slip13 = [" + getSlip13() + "]");
		System.out.println("slip_clsf16 = [" + getSlip_clsf16() + "]");
		System.out.println("slip16 = [" + getSlip16() + "]");
		System.out.println("slip_clsf17 = [" + getSlip_clsf17() + "]");
		System.out.println("slip17 = [" + getSlip17() + "]");
		System.out.println("slip_clsf20 = [" + getSlip_clsf20() + "]");
		System.out.println("slip20 = [" + getSlip20() + "]");
		System.out.println("slip_clsf21 = [" + getSlip_clsf21() + "]");
		System.out.println("slip21 = [" + getSlip21() + "]");
		System.out.println("slip_clsf22 = [" + getSlip_clsf22() + "]");
		System.out.println("slip22 = [" + getSlip22() + "]");
		System.out.println("slip_clsf26 = [" + getSlip_clsf26() + "]");
		System.out.println("slip26 = [" + getSlip26() + "]");
		System.out.println("slip_clsf27 = [" + getSlip_clsf27() + "]");
		System.out.println("slip27 = [" + getSlip27() + "]");
		System.out.println("slip_clsf30 = [" + getSlip_clsf30() + "]");
		System.out.println("slip30 = [" + getSlip30() + "]");
		System.out.println("slip_clsf32 = [" + getSlip_clsf32() + "]");
		System.out.println("slip32 = [" + getSlip32() + "]");
		System.out.println("slip_clsf33 = [" + getSlip_clsf33() + "]");
		System.out.println("slip33 = [" + getSlip33() + "]");
		System.out.println("slip_clsf34 = [" + getSlip_clsf34() + "]");
		System.out.println("slip34 = [" + getSlip34() + "]");
		System.out.println("slip_clsf35 = [" + getSlip_clsf35() + "]");
		System.out.println("slip35 = [" + getSlip35() + "]");
		System.out.println("slip_clsf36 = [" + getSlip_clsf36() + "]");
		System.out.println("slip36 = [" + getSlip36() + "]");
		System.out.println("slip_clsf40 = [" + getSlip_clsf40() + "]");
		System.out.println("slip40 = [" + getSlip40() + "]");
		System.out.println("slip_clsf41 = [" + getSlip_clsf41() + "]");
		System.out.println("slip41 = [" + getSlip41() + "]");
		System.out.println("slip_clsf42 = [" + getSlip_clsf42() + "]");
		System.out.println("slip42 = [" + getSlip42() + "]");
		System.out.println("slip_clsf50 = [" + getSlip_clsf50() + "]");
		System.out.println("slip50 = [" + getSlip50() + "]");
		System.out.println("slip_clsf51 = [" + getSlip_clsf51() + "]");
		System.out.println("slip51 = [" + getSlip51() + "]");
		System.out.println("slip_clsf52 = [" + getSlip_clsf52() + "]");
		System.out.println("slip52 = [" + getSlip52() + "]");
		System.out.println("slip_clsf53 = [" + getSlip_clsf53() + "]");
		System.out.println("slip53 = [" + getSlip53() + "]");
		System.out.println("slip_clsf54 = [" + getSlip_clsf54() + "]");
		System.out.println("slip54 = [" + getSlip54() + "]");
		System.out.println("slip_clsf55 = [" + getSlip_clsf55() + "]");
		System.out.println("slip55 = [" + getSlip55() + "]");
		System.out.println("slip_clsf60 = [" + getSlip_clsf60() + "]");
		System.out.println("slip60 = [" + getSlip60() + "]");
		System.out.println("slip_clsf61 = [" + getSlip_clsf61() + "]");
		System.out.println("slip61 = [" + getSlip61() + "]");
		System.out.println("slip_clsf62 = [" + getSlip_clsf62() + "]");
		System.out.println("slip62 = [" + getSlip62() + "]");
		System.out.println("slip_clsf63 = [" + getSlip_clsf63() + "]");
		System.out.println("slip63 = [" + getSlip63() + "]");
		System.out.println("slip_clsf64 = [" + getSlip_clsf64() + "]");
		System.out.println("slip64 = [" + getSlip64() + "]");
		System.out.println("slip_clsf90 = [" + getSlip_clsf90() + "]");
		System.out.println("slip90 = [" + getSlip90() + "]");
		System.out.println("slip_clsf91 = [" + getSlip_clsf91() + "]");
		System.out.println("slip91 = [" + getSlip91() + "]");
		System.out.println("slip_clsf92 = [" + getSlip_clsf92() + "]");
		System.out.println("slip92 = [" + getSlip92() + "]");
		System.out.println("slip_clsf93 = [" + getSlip_clsf93() + "]");
		System.out.println("slip93 = [" + getSlip93() + "]");
		System.out.println("slip_clsf94 = [" + getSlip_clsf94() + "]");
		System.out.println("slip94 = [" + getSlip94() + "]");
		System.out.println("slip_clsf95 = [" + getSlip_clsf95() + "]");
		System.out.println("slip95 = [" + getSlip95() + "]");
		System.out.println("slip_clsf96 = [" + getSlip_clsf96() + "]");
		System.out.println("slip96 = [" + getSlip96() + "]");
		System.out.println("slip_clsf97 = [" + getSlip_clsf97() + "]");
		System.out.println("slip97 = [" + getSlip97() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String abrv_nm = req.getParameter("abrv_nm");
if( abrv_nm == null){
	System.out.println(this.toString+" : abrv_nm is null" );
}else{
	System.out.println(this.toString+" : abrv_nm is "+abrv_nm );
}
String slip_clsf01 = req.getParameter("slip_clsf01");
if( slip_clsf01 == null){
	System.out.println(this.toString+" : slip_clsf01 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf01 is "+slip_clsf01 );
}
String slip01 = req.getParameter("slip01");
if( slip01 == null){
	System.out.println(this.toString+" : slip01 is null" );
}else{
	System.out.println(this.toString+" : slip01 is "+slip01 );
}
String slip_clsf02 = req.getParameter("slip_clsf02");
if( slip_clsf02 == null){
	System.out.println(this.toString+" : slip_clsf02 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf02 is "+slip_clsf02 );
}
String slip02 = req.getParameter("slip02");
if( slip02 == null){
	System.out.println(this.toString+" : slip02 is null" );
}else{
	System.out.println(this.toString+" : slip02 is "+slip02 );
}
String slip_clsf03 = req.getParameter("slip_clsf03");
if( slip_clsf03 == null){
	System.out.println(this.toString+" : slip_clsf03 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf03 is "+slip_clsf03 );
}
String slip03 = req.getParameter("slip03");
if( slip03 == null){
	System.out.println(this.toString+" : slip03 is null" );
}else{
	System.out.println(this.toString+" : slip03 is "+slip03 );
}
String slip_clsf10 = req.getParameter("slip_clsf10");
if( slip_clsf10 == null){
	System.out.println(this.toString+" : slip_clsf10 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf10 is "+slip_clsf10 );
}
String slip10 = req.getParameter("slip10");
if( slip10 == null){
	System.out.println(this.toString+" : slip10 is null" );
}else{
	System.out.println(this.toString+" : slip10 is "+slip10 );
}
String slip_clsf11 = req.getParameter("slip_clsf11");
if( slip_clsf11 == null){
	System.out.println(this.toString+" : slip_clsf11 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf11 is "+slip_clsf11 );
}
String slip11 = req.getParameter("slip11");
if( slip11 == null){
	System.out.println(this.toString+" : slip11 is null" );
}else{
	System.out.println(this.toString+" : slip11 is "+slip11 );
}
String slip_clsf12 = req.getParameter("slip_clsf12");
if( slip_clsf12 == null){
	System.out.println(this.toString+" : slip_clsf12 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf12 is "+slip_clsf12 );
}
String slip12 = req.getParameter("slip12");
if( slip12 == null){
	System.out.println(this.toString+" : slip12 is null" );
}else{
	System.out.println(this.toString+" : slip12 is "+slip12 );
}
String slip_clsf13 = req.getParameter("slip_clsf13");
if( slip_clsf13 == null){
	System.out.println(this.toString+" : slip_clsf13 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf13 is "+slip_clsf13 );
}
String slip13 = req.getParameter("slip13");
if( slip13 == null){
	System.out.println(this.toString+" : slip13 is null" );
}else{
	System.out.println(this.toString+" : slip13 is "+slip13 );
}
String slip_clsf16 = req.getParameter("slip_clsf16");
if( slip_clsf16 == null){
	System.out.println(this.toString+" : slip_clsf16 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf16 is "+slip_clsf16 );
}
String slip16 = req.getParameter("slip16");
if( slip16 == null){
	System.out.println(this.toString+" : slip16 is null" );
}else{
	System.out.println(this.toString+" : slip16 is "+slip16 );
}
String slip_clsf17 = req.getParameter("slip_clsf17");
if( slip_clsf17 == null){
	System.out.println(this.toString+" : slip_clsf17 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf17 is "+slip_clsf17 );
}
String slip17 = req.getParameter("slip17");
if( slip17 == null){
	System.out.println(this.toString+" : slip17 is null" );
}else{
	System.out.println(this.toString+" : slip17 is "+slip17 );
}
String slip_clsf20 = req.getParameter("slip_clsf20");
if( slip_clsf20 == null){
	System.out.println(this.toString+" : slip_clsf20 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf20 is "+slip_clsf20 );
}
String slip20 = req.getParameter("slip20");
if( slip20 == null){
	System.out.println(this.toString+" : slip20 is null" );
}else{
	System.out.println(this.toString+" : slip20 is "+slip20 );
}
String slip_clsf21 = req.getParameter("slip_clsf21");
if( slip_clsf21 == null){
	System.out.println(this.toString+" : slip_clsf21 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf21 is "+slip_clsf21 );
}
String slip21 = req.getParameter("slip21");
if( slip21 == null){
	System.out.println(this.toString+" : slip21 is null" );
}else{
	System.out.println(this.toString+" : slip21 is "+slip21 );
}
String slip_clsf22 = req.getParameter("slip_clsf22");
if( slip_clsf22 == null){
	System.out.println(this.toString+" : slip_clsf22 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf22 is "+slip_clsf22 );
}
String slip22 = req.getParameter("slip22");
if( slip22 == null){
	System.out.println(this.toString+" : slip22 is null" );
}else{
	System.out.println(this.toString+" : slip22 is "+slip22 );
}
String slip_clsf26 = req.getParameter("slip_clsf26");
if( slip_clsf26 == null){
	System.out.println(this.toString+" : slip_clsf26 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf26 is "+slip_clsf26 );
}
String slip26 = req.getParameter("slip26");
if( slip26 == null){
	System.out.println(this.toString+" : slip26 is null" );
}else{
	System.out.println(this.toString+" : slip26 is "+slip26 );
}
String slip_clsf27 = req.getParameter("slip_clsf27");
if( slip_clsf27 == null){
	System.out.println(this.toString+" : slip_clsf27 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf27 is "+slip_clsf27 );
}
String slip27 = req.getParameter("slip27");
if( slip27 == null){
	System.out.println(this.toString+" : slip27 is null" );
}else{
	System.out.println(this.toString+" : slip27 is "+slip27 );
}
String slip_clsf30 = req.getParameter("slip_clsf30");
if( slip_clsf30 == null){
	System.out.println(this.toString+" : slip_clsf30 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf30 is "+slip_clsf30 );
}
String slip30 = req.getParameter("slip30");
if( slip30 == null){
	System.out.println(this.toString+" : slip30 is null" );
}else{
	System.out.println(this.toString+" : slip30 is "+slip30 );
}
String slip_clsf32 = req.getParameter("slip_clsf32");
if( slip_clsf32 == null){
	System.out.println(this.toString+" : slip_clsf32 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf32 is "+slip_clsf32 );
}
String slip32 = req.getParameter("slip32");
if( slip32 == null){
	System.out.println(this.toString+" : slip32 is null" );
}else{
	System.out.println(this.toString+" : slip32 is "+slip32 );
}
String slip_clsf33 = req.getParameter("slip_clsf33");
if( slip_clsf33 == null){
	System.out.println(this.toString+" : slip_clsf33 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf33 is "+slip_clsf33 );
}
String slip33 = req.getParameter("slip33");
if( slip33 == null){
	System.out.println(this.toString+" : slip33 is null" );
}else{
	System.out.println(this.toString+" : slip33 is "+slip33 );
}
String slip_clsf34 = req.getParameter("slip_clsf34");
if( slip_clsf34 == null){
	System.out.println(this.toString+" : slip_clsf34 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf34 is "+slip_clsf34 );
}
String slip34 = req.getParameter("slip34");
if( slip34 == null){
	System.out.println(this.toString+" : slip34 is null" );
}else{
	System.out.println(this.toString+" : slip34 is "+slip34 );
}
String slip_clsf35 = req.getParameter("slip_clsf35");
if( slip_clsf35 == null){
	System.out.println(this.toString+" : slip_clsf35 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf35 is "+slip_clsf35 );
}
String slip35 = req.getParameter("slip35");
if( slip35 == null){
	System.out.println(this.toString+" : slip35 is null" );
}else{
	System.out.println(this.toString+" : slip35 is "+slip35 );
}
String slip_clsf36 = req.getParameter("slip_clsf36");
if( slip_clsf36 == null){
	System.out.println(this.toString+" : slip_clsf36 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf36 is "+slip_clsf36 );
}
String slip36 = req.getParameter("slip36");
if( slip36 == null){
	System.out.println(this.toString+" : slip36 is null" );
}else{
	System.out.println(this.toString+" : slip36 is "+slip36 );
}
String slip_clsf40 = req.getParameter("slip_clsf40");
if( slip_clsf40 == null){
	System.out.println(this.toString+" : slip_clsf40 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf40 is "+slip_clsf40 );
}
String slip40 = req.getParameter("slip40");
if( slip40 == null){
	System.out.println(this.toString+" : slip40 is null" );
}else{
	System.out.println(this.toString+" : slip40 is "+slip40 );
}
String slip_clsf41 = req.getParameter("slip_clsf41");
if( slip_clsf41 == null){
	System.out.println(this.toString+" : slip_clsf41 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf41 is "+slip_clsf41 );
}
String slip41 = req.getParameter("slip41");
if( slip41 == null){
	System.out.println(this.toString+" : slip41 is null" );
}else{
	System.out.println(this.toString+" : slip41 is "+slip41 );
}
String slip_clsf42 = req.getParameter("slip_clsf42");
if( slip_clsf42 == null){
	System.out.println(this.toString+" : slip_clsf42 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf42 is "+slip_clsf42 );
}
String slip42 = req.getParameter("slip42");
if( slip42 == null){
	System.out.println(this.toString+" : slip42 is null" );
}else{
	System.out.println(this.toString+" : slip42 is "+slip42 );
}
String slip_clsf50 = req.getParameter("slip_clsf50");
if( slip_clsf50 == null){
	System.out.println(this.toString+" : slip_clsf50 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf50 is "+slip_clsf50 );
}
String slip50 = req.getParameter("slip50");
if( slip50 == null){
	System.out.println(this.toString+" : slip50 is null" );
}else{
	System.out.println(this.toString+" : slip50 is "+slip50 );
}
String slip_clsf51 = req.getParameter("slip_clsf51");
if( slip_clsf51 == null){
	System.out.println(this.toString+" : slip_clsf51 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf51 is "+slip_clsf51 );
}
String slip51 = req.getParameter("slip51");
if( slip51 == null){
	System.out.println(this.toString+" : slip51 is null" );
}else{
	System.out.println(this.toString+" : slip51 is "+slip51 );
}
String slip_clsf52 = req.getParameter("slip_clsf52");
if( slip_clsf52 == null){
	System.out.println(this.toString+" : slip_clsf52 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf52 is "+slip_clsf52 );
}
String slip52 = req.getParameter("slip52");
if( slip52 == null){
	System.out.println(this.toString+" : slip52 is null" );
}else{
	System.out.println(this.toString+" : slip52 is "+slip52 );
}
String slip_clsf53 = req.getParameter("slip_clsf53");
if( slip_clsf53 == null){
	System.out.println(this.toString+" : slip_clsf53 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf53 is "+slip_clsf53 );
}
String slip53 = req.getParameter("slip53");
if( slip53 == null){
	System.out.println(this.toString+" : slip53 is null" );
}else{
	System.out.println(this.toString+" : slip53 is "+slip53 );
}
String slip_clsf54 = req.getParameter("slip_clsf54");
if( slip_clsf54 == null){
	System.out.println(this.toString+" : slip_clsf54 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf54 is "+slip_clsf54 );
}
String slip54 = req.getParameter("slip54");
if( slip54 == null){
	System.out.println(this.toString+" : slip54 is null" );
}else{
	System.out.println(this.toString+" : slip54 is "+slip54 );
}
String slip_clsf55 = req.getParameter("slip_clsf55");
if( slip_clsf55 == null){
	System.out.println(this.toString+" : slip_clsf55 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf55 is "+slip_clsf55 );
}
String slip55 = req.getParameter("slip55");
if( slip55 == null){
	System.out.println(this.toString+" : slip55 is null" );
}else{
	System.out.println(this.toString+" : slip55 is "+slip55 );
}
String slip_clsf60 = req.getParameter("slip_clsf60");
if( slip_clsf60 == null){
	System.out.println(this.toString+" : slip_clsf60 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf60 is "+slip_clsf60 );
}
String slip60 = req.getParameter("slip60");
if( slip60 == null){
	System.out.println(this.toString+" : slip60 is null" );
}else{
	System.out.println(this.toString+" : slip60 is "+slip60 );
}
String slip_clsf61 = req.getParameter("slip_clsf61");
if( slip_clsf61 == null){
	System.out.println(this.toString+" : slip_clsf61 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf61 is "+slip_clsf61 );
}
String slip61 = req.getParameter("slip61");
if( slip61 == null){
	System.out.println(this.toString+" : slip61 is null" );
}else{
	System.out.println(this.toString+" : slip61 is "+slip61 );
}
String slip_clsf62 = req.getParameter("slip_clsf62");
if( slip_clsf62 == null){
	System.out.println(this.toString+" : slip_clsf62 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf62 is "+slip_clsf62 );
}
String slip62 = req.getParameter("slip62");
if( slip62 == null){
	System.out.println(this.toString+" : slip62 is null" );
}else{
	System.out.println(this.toString+" : slip62 is "+slip62 );
}
String slip_clsf63 = req.getParameter("slip_clsf63");
if( slip_clsf63 == null){
	System.out.println(this.toString+" : slip_clsf63 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf63 is "+slip_clsf63 );
}
String slip63 = req.getParameter("slip63");
if( slip63 == null){
	System.out.println(this.toString+" : slip63 is null" );
}else{
	System.out.println(this.toString+" : slip63 is "+slip63 );
}
String slip_clsf64 = req.getParameter("slip_clsf64");
if( slip_clsf64 == null){
	System.out.println(this.toString+" : slip_clsf64 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf64 is "+slip_clsf64 );
}
String slip64 = req.getParameter("slip64");
if( slip64 == null){
	System.out.println(this.toString+" : slip64 is null" );
}else{
	System.out.println(this.toString+" : slip64 is "+slip64 );
}
String slip_clsf90 = req.getParameter("slip_clsf90");
if( slip_clsf90 == null){
	System.out.println(this.toString+" : slip_clsf90 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf90 is "+slip_clsf90 );
}
String slip90 = req.getParameter("slip90");
if( slip90 == null){
	System.out.println(this.toString+" : slip90 is null" );
}else{
	System.out.println(this.toString+" : slip90 is "+slip90 );
}
String slip_clsf91 = req.getParameter("slip_clsf91");
if( slip_clsf91 == null){
	System.out.println(this.toString+" : slip_clsf91 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf91 is "+slip_clsf91 );
}
String slip91 = req.getParameter("slip91");
if( slip91 == null){
	System.out.println(this.toString+" : slip91 is null" );
}else{
	System.out.println(this.toString+" : slip91 is "+slip91 );
}
String slip_clsf92 = req.getParameter("slip_clsf92");
if( slip_clsf92 == null){
	System.out.println(this.toString+" : slip_clsf92 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf92 is "+slip_clsf92 );
}
String slip92 = req.getParameter("slip92");
if( slip92 == null){
	System.out.println(this.toString+" : slip92 is null" );
}else{
	System.out.println(this.toString+" : slip92 is "+slip92 );
}
String slip_clsf93 = req.getParameter("slip_clsf93");
if( slip_clsf93 == null){
	System.out.println(this.toString+" : slip_clsf93 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf93 is "+slip_clsf93 );
}
String slip93 = req.getParameter("slip93");
if( slip93 == null){
	System.out.println(this.toString+" : slip93 is null" );
}else{
	System.out.println(this.toString+" : slip93 is "+slip93 );
}
String slip_clsf94 = req.getParameter("slip_clsf94");
if( slip_clsf94 == null){
	System.out.println(this.toString+" : slip_clsf94 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf94 is "+slip_clsf94 );
}
String slip94 = req.getParameter("slip94");
if( slip94 == null){
	System.out.println(this.toString+" : slip94 is null" );
}else{
	System.out.println(this.toString+" : slip94 is "+slip94 );
}
String slip_clsf95 = req.getParameter("slip_clsf95");
if( slip_clsf95 == null){
	System.out.println(this.toString+" : slip_clsf95 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf95 is "+slip_clsf95 );
}
String slip95 = req.getParameter("slip95");
if( slip95 == null){
	System.out.println(this.toString+" : slip95 is null" );
}else{
	System.out.println(this.toString+" : slip95 is "+slip95 );
}
String slip_clsf96 = req.getParameter("slip_clsf96");
if( slip_clsf96 == null){
	System.out.println(this.toString+" : slip_clsf96 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf96 is "+slip_clsf96 );
}
String slip96 = req.getParameter("slip96");
if( slip96 == null){
	System.out.println(this.toString+" : slip96 is null" );
}else{
	System.out.println(this.toString+" : slip96 is "+slip96 );
}
String slip_clsf97 = req.getParameter("slip_clsf97");
if( slip_clsf97 == null){
	System.out.println(this.toString+" : slip_clsf97 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf97 is "+slip_clsf97 );
}
String slip97 = req.getParameter("slip97");
if( slip97 == null){
	System.out.println(this.toString+" : slip97 is null" );
}else{
	System.out.println(this.toString+" : slip97 is "+slip97 );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String abrv_nm = Util.checkString(req.getParameter("abrv_nm"));
String slip_clsf01 = Util.checkString(req.getParameter("slip_clsf01"));
String slip01 = Util.checkString(req.getParameter("slip01"));
String slip_clsf02 = Util.checkString(req.getParameter("slip_clsf02"));
String slip02 = Util.checkString(req.getParameter("slip02"));
String slip_clsf03 = Util.checkString(req.getParameter("slip_clsf03"));
String slip03 = Util.checkString(req.getParameter("slip03"));
String slip_clsf10 = Util.checkString(req.getParameter("slip_clsf10"));
String slip10 = Util.checkString(req.getParameter("slip10"));
String slip_clsf11 = Util.checkString(req.getParameter("slip_clsf11"));
String slip11 = Util.checkString(req.getParameter("slip11"));
String slip_clsf12 = Util.checkString(req.getParameter("slip_clsf12"));
String slip12 = Util.checkString(req.getParameter("slip12"));
String slip_clsf13 = Util.checkString(req.getParameter("slip_clsf13"));
String slip13 = Util.checkString(req.getParameter("slip13"));
String slip_clsf16 = Util.checkString(req.getParameter("slip_clsf16"));
String slip16 = Util.checkString(req.getParameter("slip16"));
String slip_clsf17 = Util.checkString(req.getParameter("slip_clsf17"));
String slip17 = Util.checkString(req.getParameter("slip17"));
String slip_clsf20 = Util.checkString(req.getParameter("slip_clsf20"));
String slip20 = Util.checkString(req.getParameter("slip20"));
String slip_clsf21 = Util.checkString(req.getParameter("slip_clsf21"));
String slip21 = Util.checkString(req.getParameter("slip21"));
String slip_clsf22 = Util.checkString(req.getParameter("slip_clsf22"));
String slip22 = Util.checkString(req.getParameter("slip22"));
String slip_clsf26 = Util.checkString(req.getParameter("slip_clsf26"));
String slip26 = Util.checkString(req.getParameter("slip26"));
String slip_clsf27 = Util.checkString(req.getParameter("slip_clsf27"));
String slip27 = Util.checkString(req.getParameter("slip27"));
String slip_clsf30 = Util.checkString(req.getParameter("slip_clsf30"));
String slip30 = Util.checkString(req.getParameter("slip30"));
String slip_clsf32 = Util.checkString(req.getParameter("slip_clsf32"));
String slip32 = Util.checkString(req.getParameter("slip32"));
String slip_clsf33 = Util.checkString(req.getParameter("slip_clsf33"));
String slip33 = Util.checkString(req.getParameter("slip33"));
String slip_clsf34 = Util.checkString(req.getParameter("slip_clsf34"));
String slip34 = Util.checkString(req.getParameter("slip34"));
String slip_clsf35 = Util.checkString(req.getParameter("slip_clsf35"));
String slip35 = Util.checkString(req.getParameter("slip35"));
String slip_clsf36 = Util.checkString(req.getParameter("slip_clsf36"));
String slip36 = Util.checkString(req.getParameter("slip36"));
String slip_clsf40 = Util.checkString(req.getParameter("slip_clsf40"));
String slip40 = Util.checkString(req.getParameter("slip40"));
String slip_clsf41 = Util.checkString(req.getParameter("slip_clsf41"));
String slip41 = Util.checkString(req.getParameter("slip41"));
String slip_clsf42 = Util.checkString(req.getParameter("slip_clsf42"));
String slip42 = Util.checkString(req.getParameter("slip42"));
String slip_clsf50 = Util.checkString(req.getParameter("slip_clsf50"));
String slip50 = Util.checkString(req.getParameter("slip50"));
String slip_clsf51 = Util.checkString(req.getParameter("slip_clsf51"));
String slip51 = Util.checkString(req.getParameter("slip51"));
String slip_clsf52 = Util.checkString(req.getParameter("slip_clsf52"));
String slip52 = Util.checkString(req.getParameter("slip52"));
String slip_clsf53 = Util.checkString(req.getParameter("slip_clsf53"));
String slip53 = Util.checkString(req.getParameter("slip53"));
String slip_clsf54 = Util.checkString(req.getParameter("slip_clsf54"));
String slip54 = Util.checkString(req.getParameter("slip54"));
String slip_clsf55 = Util.checkString(req.getParameter("slip_clsf55"));
String slip55 = Util.checkString(req.getParameter("slip55"));
String slip_clsf60 = Util.checkString(req.getParameter("slip_clsf60"));
String slip60 = Util.checkString(req.getParameter("slip60"));
String slip_clsf61 = Util.checkString(req.getParameter("slip_clsf61"));
String slip61 = Util.checkString(req.getParameter("slip61"));
String slip_clsf62 = Util.checkString(req.getParameter("slip_clsf62"));
String slip62 = Util.checkString(req.getParameter("slip62"));
String slip_clsf63 = Util.checkString(req.getParameter("slip_clsf63"));
String slip63 = Util.checkString(req.getParameter("slip63"));
String slip_clsf64 = Util.checkString(req.getParameter("slip_clsf64"));
String slip64 = Util.checkString(req.getParameter("slip64"));
String slip_clsf90 = Util.checkString(req.getParameter("slip_clsf90"));
String slip90 = Util.checkString(req.getParameter("slip90"));
String slip_clsf91 = Util.checkString(req.getParameter("slip_clsf91"));
String slip91 = Util.checkString(req.getParameter("slip91"));
String slip_clsf92 = Util.checkString(req.getParameter("slip_clsf92"));
String slip92 = Util.checkString(req.getParameter("slip92"));
String slip_clsf93 = Util.checkString(req.getParameter("slip_clsf93"));
String slip93 = Util.checkString(req.getParameter("slip93"));
String slip_clsf94 = Util.checkString(req.getParameter("slip_clsf94"));
String slip94 = Util.checkString(req.getParameter("slip94"));
String slip_clsf95 = Util.checkString(req.getParameter("slip_clsf95"));
String slip95 = Util.checkString(req.getParameter("slip95"));
String slip_clsf96 = Util.checkString(req.getParameter("slip_clsf96"));
String slip96 = Util.checkString(req.getParameter("slip96"));
String slip_clsf97 = Util.checkString(req.getParameter("slip_clsf97"));
String slip97 = Util.checkString(req.getParameter("slip97"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("abrv_nm")));
String slip_clsf01 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf01")));
String slip01 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip01")));
String slip_clsf02 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf02")));
String slip02 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip02")));
String slip_clsf03 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf03")));
String slip03 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip03")));
String slip_clsf10 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf10")));
String slip10 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip10")));
String slip_clsf11 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf11")));
String slip11 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip11")));
String slip_clsf12 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf12")));
String slip12 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip12")));
String slip_clsf13 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf13")));
String slip13 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip13")));
String slip_clsf16 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf16")));
String slip16 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip16")));
String slip_clsf17 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf17")));
String slip17 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip17")));
String slip_clsf20 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf20")));
String slip20 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip20")));
String slip_clsf21 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf21")));
String slip21 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip21")));
String slip_clsf22 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf22")));
String slip22 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip22")));
String slip_clsf26 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf26")));
String slip26 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip26")));
String slip_clsf27 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf27")));
String slip27 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip27")));
String slip_clsf30 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf30")));
String slip30 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip30")));
String slip_clsf32 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf32")));
String slip32 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip32")));
String slip_clsf33 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf33")));
String slip33 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip33")));
String slip_clsf34 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf34")));
String slip34 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip34")));
String slip_clsf35 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf35")));
String slip35 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip35")));
String slip_clsf36 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf36")));
String slip36 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip36")));
String slip_clsf40 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf40")));
String slip40 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip40")));
String slip_clsf41 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf41")));
String slip41 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip41")));
String slip_clsf42 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf42")));
String slip42 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip42")));
String slip_clsf50 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf50")));
String slip50 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip50")));
String slip_clsf51 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf51")));
String slip51 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip51")));
String slip_clsf52 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf52")));
String slip52 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip52")));
String slip_clsf53 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf53")));
String slip53 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip53")));
String slip_clsf54 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf54")));
String slip54 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip54")));
String slip_clsf55 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf55")));
String slip55 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip55")));
String slip_clsf60 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf60")));
String slip60 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip60")));
String slip_clsf61 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf61")));
String slip61 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip61")));
String slip_clsf62 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf62")));
String slip62 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip62")));
String slip_clsf63 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf63")));
String slip63 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip63")));
String slip_clsf64 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf64")));
String slip64 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip64")));
String slip_clsf90 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf90")));
String slip90 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip90")));
String slip_clsf91 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf91")));
String slip91 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip91")));
String slip_clsf92 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf92")));
String slip92 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip92")));
String slip_clsf93 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf93")));
String slip93 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip93")));
String slip_clsf94 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf94")));
String slip94 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip94")));
String slip_clsf95 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf95")));
String slip95 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip95")));
String slip_clsf96 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf96")));
String slip96 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip96")));
String slip_clsf97 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf97")));
String slip97 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip97")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setAbrv_nm(abrv_nm);
dm.setSlip_clsf01(slip_clsf01);
dm.setSlip01(slip01);
dm.setSlip_clsf02(slip_clsf02);
dm.setSlip02(slip02);
dm.setSlip_clsf03(slip_clsf03);
dm.setSlip03(slip03);
dm.setSlip_clsf10(slip_clsf10);
dm.setSlip10(slip10);
dm.setSlip_clsf11(slip_clsf11);
dm.setSlip11(slip11);
dm.setSlip_clsf12(slip_clsf12);
dm.setSlip12(slip12);
dm.setSlip_clsf13(slip_clsf13);
dm.setSlip13(slip13);
dm.setSlip_clsf16(slip_clsf16);
dm.setSlip16(slip16);
dm.setSlip_clsf17(slip_clsf17);
dm.setSlip17(slip17);
dm.setSlip_clsf20(slip_clsf20);
dm.setSlip20(slip20);
dm.setSlip_clsf21(slip_clsf21);
dm.setSlip21(slip21);
dm.setSlip_clsf22(slip_clsf22);
dm.setSlip22(slip22);
dm.setSlip_clsf26(slip_clsf26);
dm.setSlip26(slip26);
dm.setSlip_clsf27(slip_clsf27);
dm.setSlip27(slip27);
dm.setSlip_clsf30(slip_clsf30);
dm.setSlip30(slip30);
dm.setSlip_clsf32(slip_clsf32);
dm.setSlip32(slip32);
dm.setSlip_clsf33(slip_clsf33);
dm.setSlip33(slip33);
dm.setSlip_clsf34(slip_clsf34);
dm.setSlip34(slip34);
dm.setSlip_clsf35(slip_clsf35);
dm.setSlip35(slip35);
dm.setSlip_clsf36(slip_clsf36);
dm.setSlip36(slip36);
dm.setSlip_clsf40(slip_clsf40);
dm.setSlip40(slip40);
dm.setSlip_clsf41(slip_clsf41);
dm.setSlip41(slip41);
dm.setSlip_clsf42(slip_clsf42);
dm.setSlip42(slip42);
dm.setSlip_clsf50(slip_clsf50);
dm.setSlip50(slip50);
dm.setSlip_clsf51(slip_clsf51);
dm.setSlip51(slip51);
dm.setSlip_clsf52(slip_clsf52);
dm.setSlip52(slip52);
dm.setSlip_clsf53(slip_clsf53);
dm.setSlip53(slip53);
dm.setSlip_clsf54(slip_clsf54);
dm.setSlip54(slip54);
dm.setSlip_clsf55(slip_clsf55);
dm.setSlip55(slip55);
dm.setSlip_clsf60(slip_clsf60);
dm.setSlip60(slip60);
dm.setSlip_clsf61(slip_clsf61);
dm.setSlip61(slip61);
dm.setSlip_clsf62(slip_clsf62);
dm.setSlip62(slip62);
dm.setSlip_clsf63(slip_clsf63);
dm.setSlip63(slip63);
dm.setSlip_clsf64(slip_clsf64);
dm.setSlip64(slip64);
dm.setSlip_clsf90(slip_clsf90);
dm.setSlip90(slip90);
dm.setSlip_clsf91(slip_clsf91);
dm.setSlip91(slip91);
dm.setSlip_clsf92(slip_clsf92);
dm.setSlip92(slip92);
dm.setSlip_clsf93(slip_clsf93);
dm.setSlip93(slip93);
dm.setSlip_clsf94(slip_clsf94);
dm.setSlip94(slip94);
dm.setSlip_clsf95(slip_clsf95);
dm.setSlip95(slip95);
dm.setSlip_clsf96(slip_clsf96);
dm.setSlip96(slip96);
dm.setSlip_clsf97(slip_clsf97);
dm.setSlip97(slip97);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 20 17:32:40 KST 2009 */