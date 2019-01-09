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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_9301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String drvr_nm;
	public String tm07000730;
	public String tm07300800;
	public String tm08000830;
	public String tm08300900;
	public String tm09000930;
	public String tm09301000;
	public String tm10001030;
	public String tm10301100;
	public String tm11001130;
	public String tm11301200;
	public String tm12001230;
	public String tm12301300;
	public String tm13001330;
	public String tm13301400;
	public String tm14001430;
	public String tm14301500;
	public String tm15001530;
	public String tm15301600;
	public String tm16001630;
	public String tm16301700;
	public String tm17001730;
	public String tm17301800;
	public String tm18001830;
	public String tm18301900;
	public String tm19001930;
	public String tm19302000;
	public String tm20002030;
	public String tm20302100;
	public String tm21002130;
	public String tm21302200;
	public String tm22002230;
	public String tm22302300;
	public String tm23002330;
	public String tm23302400;
	public String tm00000030;
	public String tm00300100;
	public String tm01000130;
	public String tm01300200;
	public String tm02000230;
	public String tm02300300;
	public String tm03000330;
	public String tm03300400;
	public String tm04000430;
	public String tm04300500;
	public String tm05000530;
	public String tm05300600;
	public String tm06000630;
	public String tm06300700;

	public MT_ETCCAR_9301_LCURLISTRecord(){}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setTm07000730(String tm07000730){
		this.tm07000730 = tm07000730;
	}

	public void setTm07300800(String tm07300800){
		this.tm07300800 = tm07300800;
	}

	public void setTm08000830(String tm08000830){
		this.tm08000830 = tm08000830;
	}

	public void setTm08300900(String tm08300900){
		this.tm08300900 = tm08300900;
	}

	public void setTm09000930(String tm09000930){
		this.tm09000930 = tm09000930;
	}

	public void setTm09301000(String tm09301000){
		this.tm09301000 = tm09301000;
	}

	public void setTm10001030(String tm10001030){
		this.tm10001030 = tm10001030;
	}

	public void setTm10301100(String tm10301100){
		this.tm10301100 = tm10301100;
	}

	public void setTm11001130(String tm11001130){
		this.tm11001130 = tm11001130;
	}

	public void setTm11301200(String tm11301200){
		this.tm11301200 = tm11301200;
	}

	public void setTm12001230(String tm12001230){
		this.tm12001230 = tm12001230;
	}

	public void setTm12301300(String tm12301300){
		this.tm12301300 = tm12301300;
	}

	public void setTm13001330(String tm13001330){
		this.tm13001330 = tm13001330;
	}

	public void setTm13301400(String tm13301400){
		this.tm13301400 = tm13301400;
	}

	public void setTm14001430(String tm14001430){
		this.tm14001430 = tm14001430;
	}

	public void setTm14301500(String tm14301500){
		this.tm14301500 = tm14301500;
	}

	public void setTm15001530(String tm15001530){
		this.tm15001530 = tm15001530;
	}

	public void setTm15301600(String tm15301600){
		this.tm15301600 = tm15301600;
	}

	public void setTm16001630(String tm16001630){
		this.tm16001630 = tm16001630;
	}

	public void setTm16301700(String tm16301700){
		this.tm16301700 = tm16301700;
	}

	public void setTm17001730(String tm17001730){
		this.tm17001730 = tm17001730;
	}

	public void setTm17301800(String tm17301800){
		this.tm17301800 = tm17301800;
	}

	public void setTm18001830(String tm18001830){
		this.tm18001830 = tm18001830;
	}

	public void setTm18301900(String tm18301900){
		this.tm18301900 = tm18301900;
	}

	public void setTm19001930(String tm19001930){
		this.tm19001930 = tm19001930;
	}

	public void setTm19302000(String tm19302000){
		this.tm19302000 = tm19302000;
	}

	public void setTm20002030(String tm20002030){
		this.tm20002030 = tm20002030;
	}

	public void setTm20302100(String tm20302100){
		this.tm20302100 = tm20302100;
	}

	public void setTm21002130(String tm21002130){
		this.tm21002130 = tm21002130;
	}

	public void setTm21302200(String tm21302200){
		this.tm21302200 = tm21302200;
	}

	public void setTm22002230(String tm22002230){
		this.tm22002230 = tm22002230;
	}

	public void setTm22302300(String tm22302300){
		this.tm22302300 = tm22302300;
	}

	public void setTm23002330(String tm23002330){
		this.tm23002330 = tm23002330;
	}

	public void setTm23302400(String tm23302400){
		this.tm23302400 = tm23302400;
	}

	public void setTm00000030(String tm00000030){
		this.tm00000030 = tm00000030;
	}

	public void setTm00300100(String tm00300100){
		this.tm00300100 = tm00300100;
	}

	public void setTm01000130(String tm01000130){
		this.tm01000130 = tm01000130;
	}

	public void setTm01300200(String tm01300200){
		this.tm01300200 = tm01300200;
	}

	public void setTm02000230(String tm02000230){
		this.tm02000230 = tm02000230;
	}

	public void setTm02300300(String tm02300300){
		this.tm02300300 = tm02300300;
	}

	public void setTm03000330(String tm03000330){
		this.tm03000330 = tm03000330;
	}

	public void setTm03300400(String tm03300400){
		this.tm03300400 = tm03300400;
	}

	public void setTm04000430(String tm04000430){
		this.tm04000430 = tm04000430;
	}

	public void setTm04300500(String tm04300500){
		this.tm04300500 = tm04300500;
	}

	public void setTm05000530(String tm05000530){
		this.tm05000530 = tm05000530;
	}

	public void setTm05300600(String tm05300600){
		this.tm05300600 = tm05300600;
	}

	public void setTm06000630(String tm06000630){
		this.tm06000630 = tm06000630;
	}

	public void setTm06300700(String tm06300700){
		this.tm06300700 = tm06300700;
	}

	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getTm07000730(){
		return this.tm07000730;
	}

	public String getTm07300800(){
		return this.tm07300800;
	}

	public String getTm08000830(){
		return this.tm08000830;
	}

	public String getTm08300900(){
		return this.tm08300900;
	}

	public String getTm09000930(){
		return this.tm09000930;
	}

	public String getTm09301000(){
		return this.tm09301000;
	}

	public String getTm10001030(){
		return this.tm10001030;
	}

	public String getTm10301100(){
		return this.tm10301100;
	}

	public String getTm11001130(){
		return this.tm11001130;
	}

	public String getTm11301200(){
		return this.tm11301200;
	}

	public String getTm12001230(){
		return this.tm12001230;
	}

	public String getTm12301300(){
		return this.tm12301300;
	}

	public String getTm13001330(){
		return this.tm13001330;
	}

	public String getTm13301400(){
		return this.tm13301400;
	}

	public String getTm14001430(){
		return this.tm14001430;
	}

	public String getTm14301500(){
		return this.tm14301500;
	}

	public String getTm15001530(){
		return this.tm15001530;
	}

	public String getTm15301600(){
		return this.tm15301600;
	}

	public String getTm16001630(){
		return this.tm16001630;
	}

	public String getTm16301700(){
		return this.tm16301700;
	}

	public String getTm17001730(){
		return this.tm17001730;
	}

	public String getTm17301800(){
		return this.tm17301800;
	}

	public String getTm18001830(){
		return this.tm18001830;
	}

	public String getTm18301900(){
		return this.tm18301900;
	}

	public String getTm19001930(){
		return this.tm19001930;
	}

	public String getTm19302000(){
		return this.tm19302000;
	}

	public String getTm20002030(){
		return this.tm20002030;
	}

	public String getTm20302100(){
		return this.tm20302100;
	}

	public String getTm21002130(){
		return this.tm21002130;
	}

	public String getTm21302200(){
		return this.tm21302200;
	}

	public String getTm22002230(){
		return this.tm22002230;
	}

	public String getTm22302300(){
		return this.tm22302300;
	}

	public String getTm23002330(){
		return this.tm23002330;
	}

	public String getTm23302400(){
		return this.tm23302400;
	}

	public String getTm00000030(){
		return this.tm00000030;
	}

	public String getTm00300100(){
		return this.tm00300100;
	}

	public String getTm01000130(){
		return this.tm01000130;
	}

	public String getTm01300200(){
		return this.tm01300200;
	}

	public String getTm02000230(){
		return this.tm02000230;
	}

	public String getTm02300300(){
		return this.tm02300300;
	}

	public String getTm03000330(){
		return this.tm03000330;
	}

	public String getTm03300400(){
		return this.tm03300400;
	}

	public String getTm04000430(){
		return this.tm04000430;
	}

	public String getTm04300500(){
		return this.tm04300500;
	}

	public String getTm05000530(){
		return this.tm05000530;
	}

	public String getTm05300600(){
		return this.tm05300600;
	}

	public String getTm06000630(){
		return this.tm06000630;
	}

	public String getTm06300700(){
		return this.tm06300700;
	}
}

/* 작성시간 : Mon Sep 10 18:49:20 KST 2012 */