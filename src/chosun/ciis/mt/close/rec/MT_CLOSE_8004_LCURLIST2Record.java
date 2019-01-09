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


package chosun.ciis.mt.close.rec;

import java.sql.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */


public class MT_CLOSE_8004_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String fac_clsf_nm;
	public String owh_budg_cd;
	public String budg_nm;
	public String matr_cd;
	public String matr_nm;
	public String be_qunt;
	public String be_amt;
	public String qunt1;
	public String amt1;
	public String qunt2;
	public String amt2;
	public String qunt3;
	public String amt3;
	public String qunt4;
	public String amt4;
	public String qunt5;
	public String amt5;
	public String qunt6;
	public String amt6;
	public String qunt7;
	public String amt7;
	public String qunt8;
	public String amt8;
	public String qunt9;
	public String amt9;
	public String qunt10;
	public String amt10;
	public String qunt11;
	public String amt11;
	public String qunt12;
	public String amt12;
	public String qunt13;
	public String amt13;
	public String qunt14;
	public String amt14;
	public String qunt15;
	public String amt15;
	public String qunt16;
	public String amt16;
	public String qunt17;
	public String amt17;
	public String qunt18;
	public String amt18;
	public String qunt19;
	public String amt19;
	public String qunt20;
	public String amt20;
	public String qunt21;
	public String amt21;
	public String qunt22;
	public String amt22;
	public String qunt23;
	public String amt23;
	public String qunt24;
	public String amt24;
	public String qunt25;
	public String amt25;
	public String qunt26;
	public String amt26;
	public String qunt27;
	public String amt27;
	public String qunt28;
	public String amt28;
	public String qunt29;
	public String amt29;
	public String qunt30;
	public String amt30;
	public String qunt31;
	public String amt31;
	public String qunt32;
	public String amt32;
	public String qunt33;
	public String amt33;
	public String qunt34;
	public String amt34;
	public String qunt35;
	public String amt35;
	public String qunt36;
	public String amt36;
	public String qunt37;
	public String amt37;
	public String qunt38;
	public String amt38;
	public String qunt39;
	public String amt39;
	public String qunt40;
	public String amt40;
	public String qunt41;
	public String amt41;
	public String qunt42;
	public String amt42;
	public String qunt43;
	public String amt43;
	public String qunt44;
	public String amt44;
	public String qunt45;
	public String amt45;
	public String qunt46;
	public String amt46;
	public String qunt47;
	public String amt47;
	public String qunt48;
	public String amt48;
	public String qunt49;
	public String amt49;
	public String qunt50;
	public String amt50;
	public String qunt51;
	public String amt51;
	public String qunt52;
	public String amt52;
	public String qunt53;
	public String amt53;
	public String qunt54;
	public String amt54;
	public String qunt55;
	public String amt55;
	public String qunt56;
	public String amt56;
	public String qunt57;
	public String amt57;
	public String qunt58;
	public String amt58;
	public String qunt59;
	public String amt59;
	public String qunt60;
	public String amt60;
	public String qunt61;
	public String amt61;
	public String qunt62;
	public String amt62;
	public String qunt63;
	public String amt63;
	public String qunt64;
	public String amt64;
	public String qunt65;
	public String amt65;
	public String qunt66;
	public String amt66;
	public String qunt67;
	public String amt67;
	public String qunt68;
	public String amt68;
	public String qunt69;
	public String amt69;
	public String qunt70;
	public String amt70;
	public String qunt71;
	public String amt71;
	public String qunt72;
	public String amt72;
	public String qunt73;
	public String amt73;
	public String qunt74;
	public String amt74;
	public String qunt75;
	public String amt75;
	public String qunt76;
	public String amt76;
	public String qunt77;
	public String amt77;
	public String qunt78;
	public String amt78;
	public String qunt79;
	public String amt79;
	public String qunt80;
	public String amt80;
	public String qunt81;
	public String amt81;
	public String qunt82;
	public String amt82;
	public String qunt83;
	public String amt83;
	public String qunt84;
	public String amt84;
	public String qunt85;
	public String amt85;
	public String qunt86;
	public String amt86;
	public String qunt87;
	public String amt87;
	public String qunt88;
	public String amt88;
	public String qunt89;
	public String amt89;
	public String qunt90;
	public String amt90;
	public String qunt91;
	public String amt91;
	public String qunt92;
	public String amt92;
	public String qunt93;
	public String amt93;
	public String qunt94;
	public String amt94;
	public String qunt95;
	public String amt95;
	public String qunt96;
	public String amt96;
	public String qunt97;
	public String amt97;
	public String qunt98;
	public String amt98;
	public String qunt99;
	public String amt99;
	public String qunt100;
	public String amt100;

	public MT_CLOSE_8004_LCURLIST2Record(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setBe_qunt(String be_qunt){
		this.be_qunt = be_qunt;
	}

	public void setBe_amt(String be_amt){
		this.be_amt = be_amt;
	}

	public void setQunt1(String qunt1){
		this.qunt1 = qunt1;
	}

	public void setAmt1(String amt1){
		this.amt1 = amt1;
	}

	public void setQunt2(String qunt2){
		this.qunt2 = qunt2;
	}

	public void setAmt2(String amt2){
		this.amt2 = amt2;
	}

	public void setQunt3(String qunt3){
		this.qunt3 = qunt3;
	}

	public void setAmt3(String amt3){
		this.amt3 = amt3;
	}

	public void setQunt4(String qunt4){
		this.qunt4 = qunt4;
	}

	public void setAmt4(String amt4){
		this.amt4 = amt4;
	}

	public void setQunt5(String qunt5){
		this.qunt5 = qunt5;
	}

	public void setAmt5(String amt5){
		this.amt5 = amt5;
	}

	public void setQunt6(String qunt6){
		this.qunt6 = qunt6;
	}

	public void setAmt6(String amt6){
		this.amt6 = amt6;
	}

	public void setQunt7(String qunt7){
		this.qunt7 = qunt7;
	}

	public void setAmt7(String amt7){
		this.amt7 = amt7;
	}

	public void setQunt8(String qunt8){
		this.qunt8 = qunt8;
	}

	public void setAmt8(String amt8){
		this.amt8 = amt8;
	}

	public void setQunt9(String qunt9){
		this.qunt9 = qunt9;
	}

	public void setAmt9(String amt9){
		this.amt9 = amt9;
	}

	public void setQunt10(String qunt10){
		this.qunt10 = qunt10;
	}

	public void setAmt10(String amt10){
		this.amt10 = amt10;
	}

	public void setQunt11(String qunt11){
		this.qunt11 = qunt11;
	}

	public void setAmt11(String amt11){
		this.amt11 = amt11;
	}

	public void setQunt12(String qunt12){
		this.qunt12 = qunt12;
	}

	public void setAmt12(String amt12){
		this.amt12 = amt12;
	}

	public void setQunt13(String qunt13){
		this.qunt13 = qunt13;
	}

	public void setAmt13(String amt13){
		this.amt13 = amt13;
	}

	public void setQunt14(String qunt14){
		this.qunt14 = qunt14;
	}

	public void setAmt14(String amt14){
		this.amt14 = amt14;
	}

	public void setQunt15(String qunt15){
		this.qunt15 = qunt15;
	}

	public void setAmt15(String amt15){
		this.amt15 = amt15;
	}

	public void setQunt16(String qunt16){
		this.qunt16 = qunt16;
	}

	public void setAmt16(String amt16){
		this.amt16 = amt16;
	}

	public void setQunt17(String qunt17){
		this.qunt17 = qunt17;
	}

	public void setAmt17(String amt17){
		this.amt17 = amt17;
	}

	public void setQunt18(String qunt18){
		this.qunt18 = qunt18;
	}

	public void setAmt18(String amt18){
		this.amt18 = amt18;
	}

	public void setQunt19(String qunt19){
		this.qunt19 = qunt19;
	}

	public void setAmt19(String amt19){
		this.amt19 = amt19;
	}

	public void setQunt20(String qunt20){
		this.qunt20 = qunt20;
	}

	public void setAmt20(String amt20){
		this.amt20 = amt20;
	}

	public void setQunt21(String qunt21){
		this.qunt21 = qunt21;
	}

	public void setAmt21(String amt21){
		this.amt21 = amt21;
	}

	public void setQunt22(String qunt22){
		this.qunt22 = qunt22;
	}

	public void setAmt22(String amt22){
		this.amt22 = amt22;
	}

	public void setQunt23(String qunt23){
		this.qunt23 = qunt23;
	}

	public void setAmt23(String amt23){
		this.amt23 = amt23;
	}

	public void setQunt24(String qunt24){
		this.qunt24 = qunt24;
	}

	public void setAmt24(String amt24){
		this.amt24 = amt24;
	}

	public void setQunt25(String qunt25){
		this.qunt25 = qunt25;
	}

	public void setAmt25(String amt25){
		this.amt25 = amt25;
	}

	public void setQunt26(String qunt26){
		this.qunt26 = qunt26;
	}

	public void setAmt26(String amt26){
		this.amt26 = amt26;
	}

	public void setQunt27(String qunt27){
		this.qunt27 = qunt27;
	}

	public void setAmt27(String amt27){
		this.amt27 = amt27;
	}

	public void setQunt28(String qunt28){
		this.qunt28 = qunt28;
	}

	public void setAmt28(String amt28){
		this.amt28 = amt28;
	}

	public void setQunt29(String qunt29){
		this.qunt29 = qunt29;
	}

	public void setAmt29(String amt29){
		this.amt29 = amt29;
	}

	public void setQunt30(String qunt30){
		this.qunt30 = qunt30;
	}

	public void setAmt30(String amt30){
		this.amt30 = amt30;
	}

	public void setQunt31(String qunt31){
		this.qunt31 = qunt31;
	}

	public void setAmt31(String amt31){
		this.amt31 = amt31;
	}

	public void setQunt32(String qunt32){
		this.qunt32 = qunt32;
	}

	public void setAmt32(String amt32){
		this.amt32 = amt32;
	}

	public void setQunt33(String qunt33){
		this.qunt33 = qunt33;
	}

	public void setAmt33(String amt33){
		this.amt33 = amt33;
	}

	public void setQunt34(String qunt34){
		this.qunt34 = qunt34;
	}

	public void setAmt34(String amt34){
		this.amt34 = amt34;
	}

	public void setQunt35(String qunt35){
		this.qunt35 = qunt35;
	}

	public void setAmt35(String amt35){
		this.amt35 = amt35;
	}

	public void setQunt36(String qunt36){
		this.qunt36 = qunt36;
	}

	public void setAmt36(String amt36){
		this.amt36 = amt36;
	}

	public void setQunt37(String qunt37){
		this.qunt37 = qunt37;
	}

	public void setAmt37(String amt37){
		this.amt37 = amt37;
	}

	public void setQunt38(String qunt38){
		this.qunt38 = qunt38;
	}

	public void setAmt38(String amt38){
		this.amt38 = amt38;
	}

	public void setQunt39(String qunt39){
		this.qunt39 = qunt39;
	}

	public void setAmt39(String amt39){
		this.amt39 = amt39;
	}

	public void setQunt40(String qunt40){
		this.qunt40 = qunt40;
	}

	public void setAmt40(String amt40){
		this.amt40 = amt40;
	}

	public void setQunt41(String qunt41){
		this.qunt41 = qunt41;
	}

	public void setAmt41(String amt41){
		this.amt41 = amt41;
	}

	public void setQunt42(String qunt42){
		this.qunt42 = qunt42;
	}

	public void setAmt42(String amt42){
		this.amt42 = amt42;
	}

	public void setQunt43(String qunt43){
		this.qunt43 = qunt43;
	}

	public void setAmt43(String amt43){
		this.amt43 = amt43;
	}

	public void setQunt44(String qunt44){
		this.qunt44 = qunt44;
	}

	public void setAmt44(String amt44){
		this.amt44 = amt44;
	}

	public void setQunt45(String qunt45){
		this.qunt45 = qunt45;
	}

	public void setAmt45(String amt45){
		this.amt45 = amt45;
	}

	public void setQunt46(String qunt46){
		this.qunt46 = qunt46;
	}

	public void setAmt46(String amt46){
		this.amt46 = amt46;
	}

	public void setQunt47(String qunt47){
		this.qunt47 = qunt47;
	}

	public void setAmt47(String amt47){
		this.amt47 = amt47;
	}

	public void setQunt48(String qunt48){
		this.qunt48 = qunt48;
	}

	public void setAmt48(String amt48){
		this.amt48 = amt48;
	}

	public void setQunt49(String qunt49){
		this.qunt49 = qunt49;
	}

	public void setAmt49(String amt49){
		this.amt49 = amt49;
	}

	public void setQunt50(String qunt50){
		this.qunt50 = qunt50;
	}

	public void setAmt50(String amt50){
		this.amt50 = amt50;
	}

	public void setQunt51(String qunt51){
		this.qunt51 = qunt51;
	}

	public void setAmt51(String amt51){
		this.amt51 = amt51;
	}

	public void setQunt52(String qunt52){
		this.qunt52 = qunt52;
	}

	public void setAmt52(String amt52){
		this.amt52 = amt52;
	}

	public void setQunt53(String qunt53){
		this.qunt53 = qunt53;
	}

	public void setAmt53(String amt53){
		this.amt53 = amt53;
	}

	public void setQunt54(String qunt54){
		this.qunt54 = qunt54;
	}

	public void setAmt54(String amt54){
		this.amt54 = amt54;
	}

	public void setQunt55(String qunt55){
		this.qunt55 = qunt55;
	}

	public void setAmt55(String amt55){
		this.amt55 = amt55;
	}

	public void setQunt56(String qunt56){
		this.qunt56 = qunt56;
	}

	public void setAmt56(String amt56){
		this.amt56 = amt56;
	}

	public void setQunt57(String qunt57){
		this.qunt57 = qunt57;
	}

	public void setAmt57(String amt57){
		this.amt57 = amt57;
	}

	public void setQunt58(String qunt58){
		this.qunt58 = qunt58;
	}

	public void setAmt58(String amt58){
		this.amt58 = amt58;
	}

	public void setQunt59(String qunt59){
		this.qunt59 = qunt59;
	}

	public void setAmt59(String amt59){
		this.amt59 = amt59;
	}

	public void setQunt60(String qunt60){
		this.qunt60 = qunt60;
	}

	public void setAmt60(String amt60){
		this.amt60 = amt60;
	}

	public void setQunt61(String qunt61){
		this.qunt61 = qunt61;
	}

	public void setAmt61(String amt61){
		this.amt61 = amt61;
	}

	public void setQunt62(String qunt62){
		this.qunt62 = qunt62;
	}

	public void setAmt62(String amt62){
		this.amt62 = amt62;
	}

	public void setQunt63(String qunt63){
		this.qunt63 = qunt63;
	}

	public void setAmt63(String amt63){
		this.amt63 = amt63;
	}

	public void setQunt64(String qunt64){
		this.qunt64 = qunt64;
	}

	public void setAmt64(String amt64){
		this.amt64 = amt64;
	}

	public void setQunt65(String qunt65){
		this.qunt65 = qunt65;
	}

	public void setAmt65(String amt65){
		this.amt65 = amt65;
	}

	public void setQunt66(String qunt66){
		this.qunt66 = qunt66;
	}

	public void setAmt66(String amt66){
		this.amt66 = amt66;
	}

	public void setQunt67(String qunt67){
		this.qunt67 = qunt67;
	}

	public void setAmt67(String amt67){
		this.amt67 = amt67;
	}

	public void setQunt68(String qunt68){
		this.qunt68 = qunt68;
	}

	public void setAmt68(String amt68){
		this.amt68 = amt68;
	}

	public void setQunt69(String qunt69){
		this.qunt69 = qunt69;
	}

	public void setAmt69(String amt69){
		this.amt69 = amt69;
	}

	public void setQunt70(String qunt70){
		this.qunt70 = qunt70;
	}

	public void setAmt70(String amt70){
		this.amt70 = amt70;
	}

	public void setQunt71(String qunt71){
		this.qunt71 = qunt71;
	}

	public void setAmt71(String amt71){
		this.amt71 = amt71;
	}

	public void setQunt72(String qunt72){
		this.qunt72 = qunt72;
	}

	public void setAmt72(String amt72){
		this.amt72 = amt72;
	}

	public void setQunt73(String qunt73){
		this.qunt73 = qunt73;
	}

	public void setAmt73(String amt73){
		this.amt73 = amt73;
	}

	public void setQunt74(String qunt74){
		this.qunt74 = qunt74;
	}

	public void setAmt74(String amt74){
		this.amt74 = amt74;
	}

	public void setQunt75(String qunt75){
		this.qunt75 = qunt75;
	}

	public void setAmt75(String amt75){
		this.amt75 = amt75;
	}

	public void setQunt76(String qunt76){
		this.qunt76 = qunt76;
	}

	public void setAmt76(String amt76){
		this.amt76 = amt76;
	}

	public void setQunt77(String qunt77){
		this.qunt77 = qunt77;
	}

	public void setAmt77(String amt77){
		this.amt77 = amt77;
	}

	public void setQunt78(String qunt78){
		this.qunt78 = qunt78;
	}

	public void setAmt78(String amt78){
		this.amt78 = amt78;
	}

	public void setQunt79(String qunt79){
		this.qunt79 = qunt79;
	}

	public void setAmt79(String amt79){
		this.amt79 = amt79;
	}

	public void setQunt80(String qunt80){
		this.qunt80 = qunt80;
	}

	public void setAmt80(String amt80){
		this.amt80 = amt80;
	}

	public void setQunt81(String qunt81){
		this.qunt81 = qunt81;
	}

	public void setAmt81(String amt81){
		this.amt81 = amt81;
	}

	public void setQunt82(String qunt82){
		this.qunt82 = qunt82;
	}

	public void setAmt82(String amt82){
		this.amt82 = amt82;
	}

	public void setQunt83(String qunt83){
		this.qunt83 = qunt83;
	}

	public void setAmt83(String amt83){
		this.amt83 = amt83;
	}

	public void setQunt84(String qunt84){
		this.qunt84 = qunt84;
	}

	public void setAmt84(String amt84){
		this.amt84 = amt84;
	}

	public void setQunt85(String qunt85){
		this.qunt85 = qunt85;
	}

	public void setAmt85(String amt85){
		this.amt85 = amt85;
	}

	public void setQunt86(String qunt86){
		this.qunt86 = qunt86;
	}

	public void setAmt86(String amt86){
		this.amt86 = amt86;
	}

	public void setQunt87(String qunt87){
		this.qunt87 = qunt87;
	}

	public void setAmt87(String amt87){
		this.amt87 = amt87;
	}

	public void setQunt88(String qunt88){
		this.qunt88 = qunt88;
	}

	public void setAmt88(String amt88){
		this.amt88 = amt88;
	}

	public void setQunt89(String qunt89){
		this.qunt89 = qunt89;
	}

	public void setAmt89(String amt89){
		this.amt89 = amt89;
	}

	public void setQunt90(String qunt90){
		this.qunt90 = qunt90;
	}

	public void setAmt90(String amt90){
		this.amt90 = amt90;
	}

	public void setQunt91(String qunt91){
		this.qunt91 = qunt91;
	}

	public void setAmt91(String amt91){
		this.amt91 = amt91;
	}

	public void setQunt92(String qunt92){
		this.qunt92 = qunt92;
	}

	public void setAmt92(String amt92){
		this.amt92 = amt92;
	}

	public void setQunt93(String qunt93){
		this.qunt93 = qunt93;
	}

	public void setAmt93(String amt93){
		this.amt93 = amt93;
	}

	public void setQunt94(String qunt94){
		this.qunt94 = qunt94;
	}

	public void setAmt94(String amt94){
		this.amt94 = amt94;
	}

	public void setQunt95(String qunt95){
		this.qunt95 = qunt95;
	}

	public void setAmt95(String amt95){
		this.amt95 = amt95;
	}

	public void setQunt96(String qunt96){
		this.qunt96 = qunt96;
	}

	public void setAmt96(String amt96){
		this.amt96 = amt96;
	}

	public void setQunt97(String qunt97){
		this.qunt97 = qunt97;
	}

	public void setAmt97(String amt97){
		this.amt97 = amt97;
	}

	public void setQunt98(String qunt98){
		this.qunt98 = qunt98;
	}

	public void setAmt98(String amt98){
		this.amt98 = amt98;
	}

	public void setQunt99(String qunt99){
		this.qunt99 = qunt99;
	}

	public void setAmt99(String amt99){
		this.amt99 = amt99;
	}

	public void setQunt100(String qunt100){
		this.qunt100 = qunt100;
	}

	public void setAmt100(String amt100){
		this.amt100 = amt100;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getBe_qunt(){
		return this.be_qunt;
	}

	public String getBe_amt(){
		return this.be_amt;
	}

	public String getQunt1(){
		return this.qunt1;
	}

	public String getAmt1(){
		return this.amt1;
	}

	public String getQunt2(){
		return this.qunt2;
	}

	public String getAmt2(){
		return this.amt2;
	}

	public String getQunt3(){
		return this.qunt3;
	}

	public String getAmt3(){
		return this.amt3;
	}

	public String getQunt4(){
		return this.qunt4;
	}

	public String getAmt4(){
		return this.amt4;
	}

	public String getQunt5(){
		return this.qunt5;
	}

	public String getAmt5(){
		return this.amt5;
	}

	public String getQunt6(){
		return this.qunt6;
	}

	public String getAmt6(){
		return this.amt6;
	}

	public String getQunt7(){
		return this.qunt7;
	}

	public String getAmt7(){
		return this.amt7;
	}

	public String getQunt8(){
		return this.qunt8;
	}

	public String getAmt8(){
		return this.amt8;
	}

	public String getQunt9(){
		return this.qunt9;
	}

	public String getAmt9(){
		return this.amt9;
	}

	public String getQunt10(){
		return this.qunt10;
	}

	public String getAmt10(){
		return this.amt10;
	}

	public String getQunt11(){
		return this.qunt11;
	}

	public String getAmt11(){
		return this.amt11;
	}

	public String getQunt12(){
		return this.qunt12;
	}

	public String getAmt12(){
		return this.amt12;
	}

	public String getQunt13(){
		return this.qunt13;
	}

	public String getAmt13(){
		return this.amt13;
	}

	public String getQunt14(){
		return this.qunt14;
	}

	public String getAmt14(){
		return this.amt14;
	}

	public String getQunt15(){
		return this.qunt15;
	}

	public String getAmt15(){
		return this.amt15;
	}

	public String getQunt16(){
		return this.qunt16;
	}

	public String getAmt16(){
		return this.amt16;
	}

	public String getQunt17(){
		return this.qunt17;
	}

	public String getAmt17(){
		return this.amt17;
	}

	public String getQunt18(){
		return this.qunt18;
	}

	public String getAmt18(){
		return this.amt18;
	}

	public String getQunt19(){
		return this.qunt19;
	}

	public String getAmt19(){
		return this.amt19;
	}

	public String getQunt20(){
		return this.qunt20;
	}

	public String getAmt20(){
		return this.amt20;
	}

	public String getQunt21(){
		return this.qunt21;
	}

	public String getAmt21(){
		return this.amt21;
	}

	public String getQunt22(){
		return this.qunt22;
	}

	public String getAmt22(){
		return this.amt22;
	}

	public String getQunt23(){
		return this.qunt23;
	}

	public String getAmt23(){
		return this.amt23;
	}

	public String getQunt24(){
		return this.qunt24;
	}

	public String getAmt24(){
		return this.amt24;
	}

	public String getQunt25(){
		return this.qunt25;
	}

	public String getAmt25(){
		return this.amt25;
	}

	public String getQunt26(){
		return this.qunt26;
	}

	public String getAmt26(){
		return this.amt26;
	}

	public String getQunt27(){
		return this.qunt27;
	}

	public String getAmt27(){
		return this.amt27;
	}

	public String getQunt28(){
		return this.qunt28;
	}

	public String getAmt28(){
		return this.amt28;
	}

	public String getQunt29(){
		return this.qunt29;
	}

	public String getAmt29(){
		return this.amt29;
	}

	public String getQunt30(){
		return this.qunt30;
	}

	public String getAmt30(){
		return this.amt30;
	}

	public String getQunt31(){
		return this.qunt31;
	}

	public String getAmt31(){
		return this.amt31;
	}

	public String getQunt32(){
		return this.qunt32;
	}

	public String getAmt32(){
		return this.amt32;
	}

	public String getQunt33(){
		return this.qunt33;
	}

	public String getAmt33(){
		return this.amt33;
	}

	public String getQunt34(){
		return this.qunt34;
	}

	public String getAmt34(){
		return this.amt34;
	}

	public String getQunt35(){
		return this.qunt35;
	}

	public String getAmt35(){
		return this.amt35;
	}

	public String getQunt36(){
		return this.qunt36;
	}

	public String getAmt36(){
		return this.amt36;
	}

	public String getQunt37(){
		return this.qunt37;
	}

	public String getAmt37(){
		return this.amt37;
	}

	public String getQunt38(){
		return this.qunt38;
	}

	public String getAmt38(){
		return this.amt38;
	}

	public String getQunt39(){
		return this.qunt39;
	}

	public String getAmt39(){
		return this.amt39;
	}

	public String getQunt40(){
		return this.qunt40;
	}

	public String getAmt40(){
		return this.amt40;
	}

	public String getQunt41(){
		return this.qunt41;
	}

	public String getAmt41(){
		return this.amt41;
	}

	public String getQunt42(){
		return this.qunt42;
	}

	public String getAmt42(){
		return this.amt42;
	}

	public String getQunt43(){
		return this.qunt43;
	}

	public String getAmt43(){
		return this.amt43;
	}

	public String getQunt44(){
		return this.qunt44;
	}

	public String getAmt44(){
		return this.amt44;
	}

	public String getQunt45(){
		return this.qunt45;
	}

	public String getAmt45(){
		return this.amt45;
	}

	public String getQunt46(){
		return this.qunt46;
	}

	public String getAmt46(){
		return this.amt46;
	}

	public String getQunt47(){
		return this.qunt47;
	}

	public String getAmt47(){
		return this.amt47;
	}

	public String getQunt48(){
		return this.qunt48;
	}

	public String getAmt48(){
		return this.amt48;
	}

	public String getQunt49(){
		return this.qunt49;
	}

	public String getAmt49(){
		return this.amt49;
	}

	public String getQunt50(){
		return this.qunt50;
	}

	public String getAmt50(){
		return this.amt50;
	}

	public String getQunt51(){
		return this.qunt51;
	}

	public String getAmt51(){
		return this.amt51;
	}

	public String getQunt52(){
		return this.qunt52;
	}

	public String getAmt52(){
		return this.amt52;
	}

	public String getQunt53(){
		return this.qunt53;
	}

	public String getAmt53(){
		return this.amt53;
	}

	public String getQunt54(){
		return this.qunt54;
	}

	public String getAmt54(){
		return this.amt54;
	}

	public String getQunt55(){
		return this.qunt55;
	}

	public String getAmt55(){
		return this.amt55;
	}

	public String getQunt56(){
		return this.qunt56;
	}

	public String getAmt56(){
		return this.amt56;
	}

	public String getQunt57(){
		return this.qunt57;
	}

	public String getAmt57(){
		return this.amt57;
	}

	public String getQunt58(){
		return this.qunt58;
	}

	public String getAmt58(){
		return this.amt58;
	}

	public String getQunt59(){
		return this.qunt59;
	}

	public String getAmt59(){
		return this.amt59;
	}

	public String getQunt60(){
		return this.qunt60;
	}

	public String getAmt60(){
		return this.amt60;
	}

	public String getQunt61(){
		return this.qunt61;
	}

	public String getAmt61(){
		return this.amt61;
	}

	public String getQunt62(){
		return this.qunt62;
	}

	public String getAmt62(){
		return this.amt62;
	}

	public String getQunt63(){
		return this.qunt63;
	}

	public String getAmt63(){
		return this.amt63;
	}

	public String getQunt64(){
		return this.qunt64;
	}

	public String getAmt64(){
		return this.amt64;
	}

	public String getQunt65(){
		return this.qunt65;
	}

	public String getAmt65(){
		return this.amt65;
	}

	public String getQunt66(){
		return this.qunt66;
	}

	public String getAmt66(){
		return this.amt66;
	}

	public String getQunt67(){
		return this.qunt67;
	}

	public String getAmt67(){
		return this.amt67;
	}

	public String getQunt68(){
		return this.qunt68;
	}

	public String getAmt68(){
		return this.amt68;
	}

	public String getQunt69(){
		return this.qunt69;
	}

	public String getAmt69(){
		return this.amt69;
	}

	public String getQunt70(){
		return this.qunt70;
	}

	public String getAmt70(){
		return this.amt70;
	}

	public String getQunt71(){
		return this.qunt71;
	}

	public String getAmt71(){
		return this.amt71;
	}

	public String getQunt72(){
		return this.qunt72;
	}

	public String getAmt72(){
		return this.amt72;
	}

	public String getQunt73(){
		return this.qunt73;
	}

	public String getAmt73(){
		return this.amt73;
	}

	public String getQunt74(){
		return this.qunt74;
	}

	public String getAmt74(){
		return this.amt74;
	}

	public String getQunt75(){
		return this.qunt75;
	}

	public String getAmt75(){
		return this.amt75;
	}

	public String getQunt76(){
		return this.qunt76;
	}

	public String getAmt76(){
		return this.amt76;
	}

	public String getQunt77(){
		return this.qunt77;
	}

	public String getAmt77(){
		return this.amt77;
	}

	public String getQunt78(){
		return this.qunt78;
	}

	public String getAmt78(){
		return this.amt78;
	}

	public String getQunt79(){
		return this.qunt79;
	}

	public String getAmt79(){
		return this.amt79;
	}

	public String getQunt80(){
		return this.qunt80;
	}

	public String getAmt80(){
		return this.amt80;
	}

	public String getQunt81(){
		return this.qunt81;
	}

	public String getAmt81(){
		return this.amt81;
	}

	public String getQunt82(){
		return this.qunt82;
	}

	public String getAmt82(){
		return this.amt82;
	}

	public String getQunt83(){
		return this.qunt83;
	}

	public String getAmt83(){
		return this.amt83;
	}

	public String getQunt84(){
		return this.qunt84;
	}

	public String getAmt84(){
		return this.amt84;
	}

	public String getQunt85(){
		return this.qunt85;
	}

	public String getAmt85(){
		return this.amt85;
	}

	public String getQunt86(){
		return this.qunt86;
	}

	public String getAmt86(){
		return this.amt86;
	}

	public String getQunt87(){
		return this.qunt87;
	}

	public String getAmt87(){
		return this.amt87;
	}

	public String getQunt88(){
		return this.qunt88;
	}

	public String getAmt88(){
		return this.amt88;
	}

	public String getQunt89(){
		return this.qunt89;
	}

	public String getAmt89(){
		return this.amt89;
	}

	public String getQunt90(){
		return this.qunt90;
	}

	public String getAmt90(){
		return this.amt90;
	}

	public String getQunt91(){
		return this.qunt91;
	}

	public String getAmt91(){
		return this.amt91;
	}

	public String getQunt92(){
		return this.qunt92;
	}

	public String getAmt92(){
		return this.amt92;
	}

	public String getQunt93(){
		return this.qunt93;
	}

	public String getAmt93(){
		return this.amt93;
	}

	public String getQunt94(){
		return this.qunt94;
	}

	public String getAmt94(){
		return this.amt94;
	}

	public String getQunt95(){
		return this.qunt95;
	}

	public String getAmt95(){
		return this.amt95;
	}

	public String getQunt96(){
		return this.qunt96;
	}

	public String getAmt96(){
		return this.amt96;
	}

	public String getQunt97(){
		return this.qunt97;
	}

	public String getAmt97(){
		return this.amt97;
	}

	public String getQunt98(){
		return this.qunt98;
	}

	public String getAmt98(){
		return this.amt98;
	}

	public String getQunt99(){
		return this.qunt99;
	}

	public String getAmt99(){
		return this.amt99;
	}

	public String getQunt100(){
		return this.qunt100;
	}

	public String getAmt100(){
		return this.amt100;
	}
}

/* 작성시간 : Thu Aug 20 21:11:55 KST 2009 */