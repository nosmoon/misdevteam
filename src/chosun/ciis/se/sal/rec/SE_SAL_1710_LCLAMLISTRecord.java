/***************************************************************************************************
* 파일명 : SE_SAL_1710_LCLAMLISTRecord.java
* 기능 : 판매 - 지대관리 - 매출관리 - 계산서 발행
* 작성일자 : 2009-04-17
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_1710_LCLAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clam_seq			;
	public String yymm				;
	public String dept_cd			;
	public String dept_nm			;
	public String sub_dept_cd		;
	public String part_nm			;
	public String area_cd			;
	public String area_nm			;
	public String bo_cd				;
	public String bo_seq			;
	public String bo_nm				;
	public String bo_head_nm		;
	public String zip_1				;
	public String zip_2				;
	public String addr				;
	public String add_snd_clam_seq	;
	public String add_snd_bo_cd		;
	public String add_snd_bo_seq	;
	public String add_snd_area_cd	;
	public String add_snd_area_nm	;
	public String add_snd_bo_nm		;
	public String download			;

	public SE_SAL_1710_LCLAMLISTRecord(){}

	public void setClam_seq(String clam_seq){
		this.clam_seq = clam_seq;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setAdd_snd_clam_seq(String add_snd_clam_seq){
		this.add_snd_clam_seq = add_snd_clam_seq;
	}

	public void setAdd_snd_bo_cd(String add_snd_bo_cd){
		this.add_snd_bo_cd = add_snd_bo_cd;
	}

	public void setAdd_snd_bo_seq(String add_snd_bo_seq){
		this.add_snd_bo_seq = add_snd_bo_seq;
	}

	public void setAdd_snd_area_cd(String add_snd_area_cd){
		this.add_snd_area_cd = add_snd_area_cd;
	}

	public void setAdd_snd_area_nm(String add_snd_area_nm){
		this.add_snd_area_nm = add_snd_area_nm;
	}

	public void setAdd_snd_bo_nm(String add_snd_bo_nm){
		this.add_snd_bo_nm = add_snd_bo_nm;
	}

	public void setDownload(String download){
		this.download = download;
	}

	public String getClam_seq(){
		return this.clam_seq;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getAdd_snd_clam_seq(){
		return this.add_snd_clam_seq;
	}

	public String getAdd_snd_bo_cd(){
		return this.add_snd_bo_cd;
	}

	public String getAdd_snd_bo_seq(){
		return this.add_snd_bo_seq;
	}

	public String getAdd_snd_area_cd(){
		return this.add_snd_area_cd;
	}

	public String getAdd_snd_area_nm(){
		return this.add_snd_area_nm;
	}

	public String getAdd_snd_bo_nm(){
		return this.add_snd_bo_nm;
	}

	public String getDownload(){
		return this.download;
	}
}

/* 작성시간 : Fri Apr 17 13:29:34 KST 2009 */