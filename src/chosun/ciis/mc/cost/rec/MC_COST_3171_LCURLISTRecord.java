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


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 
 */


public class MC_COST_3171_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String brnm1;
	public String brcd;
	public String clas_nm;
	public String dstb_dept_cd2;
	public String dstb_dept_nm2;
	public String bgsumamt;
	public String amt0100;
	public String amt0200;
	public String amt0300;
	public String amt0301;
	public String amt0302;
	public String amt0303;
	public String amt0304;
	public String amt0305;
	public String amt0306;
	public String amt0307;
	public String amt0308;
	public String amt0400;
	public String amt0401;
	public String amt0402;
	public String amt0403;
	public String amt0500;
	public String amt0501;
	public String amt0502;
	public String amt0503;
	public String amt0504;
	public String amt0505;
	public String amt0506;
	public String amt0600;
	public String amt0601;
	public String amt0602;
	public String amt0603;
	public String amt0604;
	public String amt0605;
	public String amt0606;
	public String amt0611;
	public String amt0612;
	public String amt0613;
	public String amt0614;
	public String amt0615;
	public String amt0616;
	public String amt0617;
	public String amt0621;
	public String amt0631;
	public String amt0632;
	public String amt0700;
	public String amt0701;
	public String amt0702;
	public String amt0703;
	public String amt0704;
	public String amt0705;
	public String amt0706;
	public String amt0707;
	public String amt0708;
	public String amt0709;
	public String amt0710;
	public String amt0711;
	public String amt0712;
	public String amt9999;

	public MC_COST_3171_LCURLISTRecord(){}

	public void setBrnm1(String brnm1){
		this.brnm1 = brnm1;
	}

	public void setBrcd(String brcd){
		this.brcd = brcd;
	}

	public void setClas_nm(String clas_nm){
		this.clas_nm = clas_nm;
	}

	public void setDstb_dept_cd2(String dstb_dept_cd2){
		this.dstb_dept_cd2 = dstb_dept_cd2;
	}

	public void setDstb_dept_nm2(String dstb_dept_nm2){
		this.dstb_dept_nm2 = dstb_dept_nm2;
	}

	public void setBgsumamt(String bgsumamt){
		this.bgsumamt = bgsumamt;
	}

	public void setAmt0100(String amt0100){
		this.amt0100 = amt0100;
	}

	public void setAmt0200(String amt0200){
		this.amt0200 = amt0200;
	}

	public void setAmt0300(String amt0300){
		this.amt0300 = amt0300;
	}

	public void setAmt0301(String amt0301){
		this.amt0301 = amt0301;
	}

	public void setAmt0302(String amt0302){
		this.amt0302 = amt0302;
	}

	public void setAmt0303(String amt0303){
		this.amt0303 = amt0303;
	}

	public void setAmt0304(String amt0304){
		this.amt0304 = amt0304;
	}

	public void setAmt0305(String amt0305){
		this.amt0305 = amt0305;
	}

	public void setAmt0306(String amt0306){
		this.amt0306 = amt0306;
	}

	public void setAmt0307(String amt0307){
		this.amt0307 = amt0307;
	}

	public void setAmt0308(String amt0308){
		this.amt0308 = amt0308;
	}

	public void setAmt0400(String amt0400){
		this.amt0400 = amt0400;
	}

	public void setAmt0401(String amt0401){
		this.amt0401 = amt0401;
	}

	public void setAmt0402(String amt0402){
		this.amt0402 = amt0402;
	}

	public void setAmt0403(String amt0403){
		this.amt0403 = amt0403;
	}

	public void setAmt0500(String amt0500){
		this.amt0500 = amt0500;
	}

	public void setAmt0501(String amt0501){
		this.amt0501 = amt0501;
	}

	public void setAmt0502(String amt0502){
		this.amt0502 = amt0502;
	}

	public void setAmt0503(String amt0503){
		this.amt0503 = amt0503;
	}

	public void setAmt0504(String amt0504){
		this.amt0504 = amt0504;
	}

	public void setAmt0505(String amt0505){
		this.amt0505 = amt0505;
	}

	public void setAmt0506(String amt0506){
		this.amt0506 = amt0506;
	}

	public void setAmt0600(String amt0600){
		this.amt0600 = amt0600;
	}

	public void setAmt0601(String amt0601){
		this.amt0601 = amt0601;
	}

	public void setAmt0602(String amt0602){
		this.amt0602 = amt0602;
	}

	public void setAmt0603(String amt0603){
		this.amt0603 = amt0603;
	}

	public void setAmt0604(String amt0604){
		this.amt0604 = amt0604;
	}

	public void setAmt0605(String amt0605){
		this.amt0605 = amt0605;
	}

	public void setAmt0606(String amt0606){
		this.amt0606 = amt0606;
	}

	public void setAmt0611(String amt0611){
		this.amt0611 = amt0611;
	}

	public void setAmt0612(String amt0612){
		this.amt0612 = amt0612;
	}

	public void setAmt0613(String amt0613){
		this.amt0613 = amt0613;
	}

	public void setAmt0614(String amt0614){
		this.amt0614 = amt0614;
	}

	public void setAmt0615(String amt0615){
		this.amt0615 = amt0615;
	}

	public void setAmt0616(String amt0616){
		this.amt0616 = amt0616;
	}

	public void setAmt0617(String amt0617){
		this.amt0617 = amt0617;
	}

	public void setAmt0621(String amt0621){
		this.amt0621 = amt0621;
	}

	public void setAmt0631(String amt0631){
		this.amt0631 = amt0631;
	}

	public void setAmt0632(String amt0632){
		this.amt0632 = amt0632;
	}

	public void setAmt0700(String amt0700){
		this.amt0700 = amt0700;
	}

	public void setAmt0701(String amt0701){
		this.amt0701 = amt0701;
	}

	public void setAmt0702(String amt0702){
		this.amt0702 = amt0702;
	}

	public void setAmt0703(String amt0703){
		this.amt0703 = amt0703;
	}

	public void setAmt0704(String amt0704){
		this.amt0704 = amt0704;
	}

	public void setAmt0705(String amt0705){
		this.amt0705 = amt0705;
	}

	public void setAmt0706(String amt0706){
		this.amt0706 = amt0706;
	}

	public void setAmt0707(String amt0707){
		this.amt0707 = amt0707;
	}

	public void setAmt0708(String amt0708){
		this.amt0708 = amt0708;
	}

	public void setAmt0709(String amt0709){
		this.amt0709 = amt0709;
	}

	public void setAmt0710(String amt0710){
		this.amt0710 = amt0710;
	}

	public void setAmt0711(String amt0711){
		this.amt0711 = amt0711;
	}

	public void setAmt0712(String amt0712){
		this.amt0712 = amt0712;
	}

	public void setAmt9999(String amt9999){
		this.amt9999 = amt9999;
	}

	public String getBrnm1(){
		return this.brnm1;
	}

	public String getBrcd(){
		return this.brcd;
	}

	public String getClas_nm(){
		return this.clas_nm;
	}

	public String getDstb_dept_cd2(){
		return this.dstb_dept_cd2;
	}

	public String getDstb_dept_nm2(){
		return this.dstb_dept_nm2;
	}

	public String getBgsumamt(){
		return this.bgsumamt;
	}

	public String getAmt0100(){
		return this.amt0100;
	}

	public String getAmt0200(){
		return this.amt0200;
	}

	public String getAmt0300(){
		return this.amt0300;
	}

	public String getAmt0301(){
		return this.amt0301;
	}

	public String getAmt0302(){
		return this.amt0302;
	}

	public String getAmt0303(){
		return this.amt0303;
	}

	public String getAmt0304(){
		return this.amt0304;
	}

	public String getAmt0305(){
		return this.amt0305;
	}

	public String getAmt0306(){
		return this.amt0306;
	}

	public String getAmt0307(){
		return this.amt0307;
	}

	public String getAmt0308(){
		return this.amt0308;
	}

	public String getAmt0400(){
		return this.amt0400;
	}

	public String getAmt0401(){
		return this.amt0401;
	}

	public String getAmt0402(){
		return this.amt0402;
	}

	public String getAmt0403(){
		return this.amt0403;
	}

	public String getAmt0500(){
		return this.amt0500;
	}

	public String getAmt0501(){
		return this.amt0501;
	}

	public String getAmt0502(){
		return this.amt0502;
	}

	public String getAmt0503(){
		return this.amt0503;
	}

	public String getAmt0504(){
		return this.amt0504;
	}

	public String getAmt0505(){
		return this.amt0505;
	}

	public String getAmt0506(){
		return this.amt0506;
	}

	public String getAmt0600(){
		return this.amt0600;
	}

	public String getAmt0601(){
		return this.amt0601;
	}

	public String getAmt0602(){
		return this.amt0602;
	}

	public String getAmt0603(){
		return this.amt0603;
	}

	public String getAmt0604(){
		return this.amt0604;
	}

	public String getAmt0605(){
		return this.amt0605;
	}

	public String getAmt0606(){
		return this.amt0606;
	}

	public String getAmt0611(){
		return this.amt0611;
	}

	public String getAmt0612(){
		return this.amt0612;
	}

	public String getAmt0613(){
		return this.amt0613;
	}

	public String getAmt0614(){
		return this.amt0614;
	}

	public String getAmt0615(){
		return this.amt0615;
	}

	public String getAmt0616(){
		return this.amt0616;
	}

	public String getAmt0617(){
		return this.amt0617;
	}

	public String getAmt0621(){
		return this.amt0621;
	}

	public String getAmt0631(){
		return this.amt0631;
	}

	public String getAmt0632(){
		return this.amt0632;
	}

	public String getAmt0700(){
		return this.amt0700;
	}

	public String getAmt0701(){
		return this.amt0701;
	}

	public String getAmt0702(){
		return this.amt0702;
	}

	public String getAmt0703(){
		return this.amt0703;
	}

	public String getAmt0704(){
		return this.amt0704;
	}

	public String getAmt0705(){
		return this.amt0705;
	}

	public String getAmt0706(){
		return this.amt0706;
	}

	public String getAmt0707(){
		return this.amt0707;
	}

	public String getAmt0708(){
		return this.amt0708;
	}

	public String getAmt0709(){
		return this.amt0709;
	}

	public String getAmt0710(){
		return this.amt0710;
	}

	public String getAmt0711(){
		return this.amt0711;
	}

	public String getAmt0712(){
		return this.amt0712;
	}

	public String getAmt9999(){
		return this.amt9999;
	}
}

/* 작성시간 : Wed Sep 23 09:47:11 KST 2009 */