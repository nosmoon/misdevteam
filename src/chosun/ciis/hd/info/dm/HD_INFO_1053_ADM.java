/***************************************************************************************************
* 파일명 : .java
* 기능 : 인사급여-인사정보조회
* 작성일자 : 2014-12-23
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 비상연락처 추가
* 수정자 : 이태식
* 수정일자 :2014-12-23
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_1053_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String mode;
	public String addr_clsf_1;
	public String zip_1_1;
	public String zip_2_1;
	public String addr_1;
	public String addr_dtls_1;
	public String tel_no_1;
	public String ptph_no_1;
	public String fax_no_1;
	public String addr_clsf_2;
	public String zip_1_2;
	public String zip_2_2;
	public String addr_2;
	public String addr_dtls_2;
	public String tel_no_2;
	public String ptph_no_2;
	public String fax_no_2;
	public String email_id_2;
	public String email_nm;
	public String addr_clsf_3;
	public String forn_zip_3;
	public String forn_addr_3;
	public String tel_no_3;
	public String ptph_no_3;
	public String fax_no_3;
	public String addr_clsf_4;
	public String forn_zip_4;
	public String forn_addr_4;
	public String tel_no_4;
	public String ptph_no_4;
	public String fax_no_4;
	public String addr_clsf_5;
	public String tel_no_5;
	public String cntc_rshp;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_INFO_1053_ADM(){}
	public HD_INFO_1053_ADM(String cmpy_cd, String emp_no, String mode, String addr_clsf_1, String zip_1_1, String zip_2_1, String addr_1, String addr_dtls_1, String tel_no_1, String ptph_no_1, String fax_no_1, String addr_clsf_2, String zip_1_2, String zip_2_2, String addr_2, String addr_dtls_2, String tel_no_2, String ptph_no_2, String fax_no_2, String email_id_2, String email_nm, String addr_clsf_3, String forn_zip_3, String forn_addr_3, String tel_no_3, String ptph_no_3, String fax_no_3, String addr_clsf_4, String forn_zip_4, String forn_addr_4, String tel_no_4, String ptph_no_4, String fax_no_4, String addr_clsf_5, String tel_no_5, String cntc_rshp, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.mode = mode;
		this.addr_clsf_1 = addr_clsf_1;
		this.zip_1_1 = zip_1_1;
		this.zip_2_1 = zip_2_1;
		this.addr_1 = addr_1;
		this.addr_dtls_1 = addr_dtls_1;
		this.tel_no_1 = tel_no_1;
		this.ptph_no_1 = ptph_no_1;
		this.fax_no_1 = fax_no_1;
		this.addr_clsf_2 = addr_clsf_2;
		this.zip_1_2 = zip_1_2;
		this.zip_2_2 = zip_2_2;
		this.addr_2 = addr_2;
		this.addr_dtls_2 = addr_dtls_2;
		this.tel_no_2 = tel_no_2;
		this.ptph_no_2 = ptph_no_2;
		this.fax_no_2 = fax_no_2;
		this.email_id_2 = email_id_2;
		this.email_nm = email_nm;
		this.addr_clsf_3 = addr_clsf_3;
		this.forn_zip_3 = forn_zip_3;
		this.forn_addr_3 = forn_addr_3;
		this.tel_no_3 = tel_no_3;
		this.ptph_no_3 = ptph_no_3;
		this.fax_no_3 = fax_no_3;
		this.addr_clsf_4 = addr_clsf_4;
		this.forn_zip_4 = forn_zip_4;
		this.forn_addr_4 = forn_addr_4;
		this.tel_no_4 = tel_no_4;
		this.ptph_no_4 = ptph_no_4;
		this.fax_no_4 = fax_no_4;
		this.addr_clsf_5 = addr_clsf_5;
		this.tel_no_5 = tel_no_5;
		this.cntc_rshp = cntc_rshp;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setAddr_clsf_1(String addr_clsf_1){
		this.addr_clsf_1 = addr_clsf_1;
	}

	public void setZip_1_1(String zip_1_1){
		this.zip_1_1 = zip_1_1;
	}

	public void setZip_2_1(String zip_2_1){
		this.zip_2_1 = zip_2_1;
	}

	public void setAddr_1(String addr_1){
		this.addr_1 = addr_1;
	}

	public void setAddr_dtls_1(String addr_dtls_1){
		this.addr_dtls_1 = addr_dtls_1;
	}

	public void setTel_no_1(String tel_no_1){
		this.tel_no_1 = tel_no_1;
	}

	public void setPtph_no_1(String ptph_no_1){
		this.ptph_no_1 = ptph_no_1;
	}

	public void setFax_no_1(String fax_no_1){
		this.fax_no_1 = fax_no_1;
	}

	public void setAddr_clsf_2(String addr_clsf_2){
		this.addr_clsf_2 = addr_clsf_2;
	}

	public void setZip_1_2(String zip_1_2){
		this.zip_1_2 = zip_1_2;
	}

	public void setZip_2_2(String zip_2_2){
		this.zip_2_2 = zip_2_2;
	}

	public void setAddr_2(String addr_2){
		this.addr_2 = addr_2;
	}

	public void setAddr_dtls_2(String addr_dtls_2){
		this.addr_dtls_2 = addr_dtls_2;
	}

	public void setTel_no_2(String tel_no_2){
		this.tel_no_2 = tel_no_2;
	}

	public void setPtph_no_2(String ptph_no_2){
		this.ptph_no_2 = ptph_no_2;
	}

	public void setFax_no_2(String fax_no_2){
		this.fax_no_2 = fax_no_2;
	}

	public void setEmail_id_2(String email_id_2){
		this.email_id_2 = email_id_2;
	}
	
	public void setEmail_nm(String email_nm){
		this.email_nm = email_nm;
	}
	
	public void setAddr_clsf_3(String addr_clsf_3){
		this.addr_clsf_3 = addr_clsf_3;
	}

	public void setForn_zip_3(String forn_zip_3){
		this.forn_zip_3 = forn_zip_3;
	}

	public void setForn_addr_3(String forn_addr_3){
		this.forn_addr_3 = forn_addr_3;
	}

	public void setTel_no_3(String tel_no_3){
		this.tel_no_3 = tel_no_3;
	}

	public void setPtph_no_3(String ptph_no_3){
		this.ptph_no_3 = ptph_no_3;
	}

	public void setFax_no_3(String fax_no_3){
		this.fax_no_3 = fax_no_3;
	}

	public void setAddr_clsf_4(String addr_clsf_4){
		this.addr_clsf_4 = addr_clsf_4;
	}

	public void setForn_zip_4(String forn_zip_4){
		this.forn_zip_4 = forn_zip_4;
	}

	public void setForn_addr_4(String forn_addr_4){
		this.forn_addr_4 = forn_addr_4;
	}

	public void setTel_no_4(String tel_no_4){
		this.tel_no_4 = tel_no_4;
	}

	public void setPtph_no_4(String ptph_no_4){
		this.ptph_no_4 = ptph_no_4;
	}

	public void setFax_no_4(String fax_no_4){
		this.fax_no_4 = fax_no_4;
	}

	public void setAddr_clsf_5(String addr_clsf_5){
		this.addr_clsf_5 = addr_clsf_5;
	}

	public void setTel_no_5(String tel_no_5){
		this.tel_no_5 = tel_no_5;
	}

	public void setCntc_rshp(String cntc_rshp){
		this.cntc_rshp = cntc_rshp;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getMode(){
		return this.mode;
	}

	public String getAddr_clsf_1(){
		return this.addr_clsf_1;
	}

	public String getZip_1_1(){
		return this.zip_1_1;
	}

	public String getZip_2_1(){
		return this.zip_2_1;
	}

	public String getAddr_1(){
		return this.addr_1;
	}

	public String getAddr_dtls_1(){
		return this.addr_dtls_1;
	}

	public String getTel_no_1(){
		return this.tel_no_1;
	}

	public String getPtph_no_1(){
		return this.ptph_no_1;
	}

	public String getFax_no_1(){
		return this.fax_no_1;
	}

	public String getAddr_clsf_2(){
		return this.addr_clsf_2;
	}

	public String getZip_1_2(){
		return this.zip_1_2;
	}

	public String getZip_2_2(){
		return this.zip_2_2;
	}

	public String getAddr_2(){
		return this.addr_2;
	}

	public String getAddr_dtls_2(){
		return this.addr_dtls_2;
	}

	public String getTel_no_2(){
		return this.tel_no_2;
	}

	public String getPtph_no_2(){
		return this.ptph_no_2;
	}

	public String getFax_no_2(){
		return this.fax_no_2;
	}

	public String getEmail_id_2(){
		return this.email_id_2;
	}
	
	public String getEmail_nm(){
		return this.email_nm;
	}

	public String getAddr_clsf_3(){
		return this.addr_clsf_3;
	}

	public String getForn_zip_3(){
		return this.forn_zip_3;
	}

	public String getForn_addr_3(){
		return this.forn_addr_3;
	}

	public String getTel_no_3(){
		return this.tel_no_3;
	}

	public String getPtph_no_3(){
		return this.ptph_no_3;
	}

	public String getFax_no_3(){
		return this.fax_no_3;
	}

	public String getAddr_clsf_4(){
		return this.addr_clsf_4;
	}

	public String getForn_zip_4(){
		return this.forn_zip_4;
	}

	public String getForn_addr_4(){
		return this.forn_addr_4;
	}

	public String getTel_no_4(){
		return this.tel_no_4;
	}

	public String getPtph_no_4(){
		return this.ptph_no_4;
	}

	public String getFax_no_4(){
		return this.fax_no_4;
	}

	public String getAddr_clsf_5(){
		return this.addr_clsf_5;
	}

	public String getTel_no_5(){
		return this.tel_no_5;
	}

	public String getCntc_rshp(){
		return this.cntc_rshp;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_1053_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_1053_ADM dm = (HD_INFO_1053_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.addr_clsf_1);
		cstmt.setString(7, dm.zip_1_1);
		cstmt.setString(8, dm.zip_2_1);
		cstmt.setString(9, dm.addr_1);
		cstmt.setString(10, dm.addr_dtls_1);
		cstmt.setString(11, dm.tel_no_1);
		cstmt.setString(12, dm.ptph_no_1);
		cstmt.setString(13, dm.fax_no_1);
		cstmt.setString(14, dm.addr_clsf_2);
		cstmt.setString(15, dm.zip_1_2);
		cstmt.setString(16, dm.zip_2_2);
		cstmt.setString(17, dm.addr_2);
		cstmt.setString(18, dm.addr_dtls_2);
		cstmt.setString(19, dm.tel_no_2);
		cstmt.setString(20, dm.ptph_no_2);
		cstmt.setString(21, dm.fax_no_2);
		cstmt.setString(22, dm.email_id_2);
		cstmt.setString(23, dm.email_nm);
		cstmt.setString(24, dm.addr_clsf_3);
		cstmt.setString(25, dm.forn_zip_3);
		cstmt.setString(26, dm.forn_addr_3);
		cstmt.setString(27, dm.tel_no_3);
		cstmt.setString(28, dm.ptph_no_3);
		cstmt.setString(29, dm.fax_no_3);
		cstmt.setString(30, dm.addr_clsf_4);
		cstmt.setString(31, dm.forn_zip_4);
		cstmt.setString(32, dm.forn_addr_4);
		cstmt.setString(33, dm.tel_no_4);
		cstmt.setString(34, dm.ptph_no_4);
		cstmt.setString(35, dm.fax_no_4);
		cstmt.setString(36, dm.addr_clsf_5);
		cstmt.setString(37, dm.tel_no_5);
		cstmt.setString(38, dm.cntc_rshp);
		cstmt.setString(39, dm.incmg_pers_ipadd);
		cstmt.setString(40, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_1053_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("addr_clsf_1 = [" + getAddr_clsf_1() + "]");
		System.out.println("zip_1_1 = [" + getZip_1_1() + "]");
		System.out.println("zip_2_1 = [" + getZip_2_1() + "]");
		System.out.println("addr_1 = [" + getAddr_1() + "]");
		System.out.println("addr_dtls_1 = [" + getAddr_dtls_1() + "]");
		System.out.println("tel_no_1 = [" + getTel_no_1() + "]");
		System.out.println("ptph_no_1 = [" + getPtph_no_1() + "]");
		System.out.println("fax_no_1 = [" + getFax_no_1() + "]");
		System.out.println("addr_clsf_2 = [" + getAddr_clsf_2() + "]");
		System.out.println("zip_1_2 = [" + getZip_1_2() + "]");
		System.out.println("zip_2_2 = [" + getZip_2_2() + "]");
		System.out.println("addr_2 = [" + getAddr_2() + "]");
		System.out.println("addr_dtls_2 = [" + getAddr_dtls_2() + "]");
		System.out.println("tel_no_2 = [" + getTel_no_2() + "]");
		System.out.println("ptph_no_2 = [" + getPtph_no_2() + "]");
		System.out.println("fax_no_2 = [" + getFax_no_2() + "]");
		System.out.println("email_id_2 = [" + getEmail_id_2() + "]");
		System.out.println("email_nm = [" + getEmail_nm() + "]");
		System.out.println("addr_clsf_3 = [" + getAddr_clsf_3() + "]");
		System.out.println("forn_zip_3 = [" + getForn_zip_3() + "]");
		System.out.println("forn_addr_3 = [" + getForn_addr_3() + "]");
		System.out.println("tel_no_3 = [" + getTel_no_3() + "]");
		System.out.println("ptph_no_3 = [" + getPtph_no_3() + "]");
		System.out.println("fax_no_3 = [" + getFax_no_3() + "]");
		System.out.println("addr_clsf_4 = [" + getAddr_clsf_4() + "]");
		System.out.println("forn_zip_4 = [" + getForn_zip_4() + "]");
		System.out.println("forn_addr_4 = [" + getForn_addr_4() + "]");
		System.out.println("tel_no_4 = [" + getTel_no_4() + "]");
		System.out.println("ptph_no_4 = [" + getPtph_no_4() + "]");
		System.out.println("fax_no_4 = [" + getFax_no_4() + "]");
		System.out.println("addr_clsf_5 = [" + getAddr_clsf_5() + "]");
		System.out.println("tel_no_5 = [" + getTel_no_5() + "]");
		System.out.println("cntc_rshp = [" + getCntc_rshp() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String addr_clsf_1 = req.getParameter("addr_clsf_1");
if( addr_clsf_1 == null){
	System.out.println(this.toString+" : addr_clsf_1 is null" );
}else{
	System.out.println(this.toString+" : addr_clsf_1 is "+addr_clsf_1 );
}
String zip_1_1 = req.getParameter("zip_1_1");
if( zip_1_1 == null){
	System.out.println(this.toString+" : zip_1_1 is null" );
}else{
	System.out.println(this.toString+" : zip_1_1 is "+zip_1_1 );
}
String zip_2_1 = req.getParameter("zip_2_1");
if( zip_2_1 == null){
	System.out.println(this.toString+" : zip_2_1 is null" );
}else{
	System.out.println(this.toString+" : zip_2_1 is "+zip_2_1 );
}
String addr_1 = req.getParameter("addr_1");
if( addr_1 == null){
	System.out.println(this.toString+" : addr_1 is null" );
}else{
	System.out.println(this.toString+" : addr_1 is "+addr_1 );
}
String addr_dtls_1 = req.getParameter("addr_dtls_1");
if( addr_dtls_1 == null){
	System.out.println(this.toString+" : addr_dtls_1 is null" );
}else{
	System.out.println(this.toString+" : addr_dtls_1 is "+addr_dtls_1 );
}
String tel_no_1 = req.getParameter("tel_no_1");
if( tel_no_1 == null){
	System.out.println(this.toString+" : tel_no_1 is null" );
}else{
	System.out.println(this.toString+" : tel_no_1 is "+tel_no_1 );
}
String ptph_no_1 = req.getParameter("ptph_no_1");
if( ptph_no_1 == null){
	System.out.println(this.toString+" : ptph_no_1 is null" );
}else{
	System.out.println(this.toString+" : ptph_no_1 is "+ptph_no_1 );
}
String fax_no_1 = req.getParameter("fax_no_1");
if( fax_no_1 == null){
	System.out.println(this.toString+" : fax_no_1 is null" );
}else{
	System.out.println(this.toString+" : fax_no_1 is "+fax_no_1 );
}
String addr_clsf_2 = req.getParameter("addr_clsf_2");
if( addr_clsf_2 == null){
	System.out.println(this.toString+" : addr_clsf_2 is null" );
}else{
	System.out.println(this.toString+" : addr_clsf_2 is "+addr_clsf_2 );
}
String zip_1_2 = req.getParameter("zip_1_2");
if( zip_1_2 == null){
	System.out.println(this.toString+" : zip_1_2 is null" );
}else{
	System.out.println(this.toString+" : zip_1_2 is "+zip_1_2 );
}
String zip_2_2 = req.getParameter("zip_2_2");
if( zip_2_2 == null){
	System.out.println(this.toString+" : zip_2_2 is null" );
}else{
	System.out.println(this.toString+" : zip_2_2 is "+zip_2_2 );
}
String addr_2 = req.getParameter("addr_2");
if( addr_2 == null){
	System.out.println(this.toString+" : addr_2 is null" );
}else{
	System.out.println(this.toString+" : addr_2 is "+addr_2 );
}
String addr_dtls_2 = req.getParameter("addr_dtls_2");
if( addr_dtls_2 == null){
	System.out.println(this.toString+" : addr_dtls_2 is null" );
}else{
	System.out.println(this.toString+" : addr_dtls_2 is "+addr_dtls_2 );
}
String tel_no_2 = req.getParameter("tel_no_2");
if( tel_no_2 == null){
	System.out.println(this.toString+" : tel_no_2 is null" );
}else{
	System.out.println(this.toString+" : tel_no_2 is "+tel_no_2 );
}
String ptph_no_2 = req.getParameter("ptph_no_2");
if( ptph_no_2 == null){
	System.out.println(this.toString+" : ptph_no_2 is null" );
}else{
	System.out.println(this.toString+" : ptph_no_2 is "+ptph_no_2 );
}
String fax_no_2 = req.getParameter("fax_no_2");
if( fax_no_2 == null){
	System.out.println(this.toString+" : fax_no_2 is null" );
}else{
	System.out.println(this.toString+" : fax_no_2 is "+fax_no_2 );
}
String email_id_2 = req.getParameter("email_id_2");
if( email_id_2 == null){
	System.out.println(this.toString+" : email_id_2 is null" );
}else{
	System.out.println(this.toString+" : email_id_2 is "+email_id_2 );
}
String addr_clsf_3 = req.getParameter("addr_clsf_3");
if( addr_clsf_3 == null){
	System.out.println(this.toString+" : addr_clsf_3 is null" );
}else{
	System.out.println(this.toString+" : addr_clsf_3 is "+addr_clsf_3 );
}
String forn_zip_3 = req.getParameter("forn_zip_3");
if( forn_zip_3 == null){
	System.out.println(this.toString+" : forn_zip_3 is null" );
}else{
	System.out.println(this.toString+" : forn_zip_3 is "+forn_zip_3 );
}
String forn_addr_3 = req.getParameter("forn_addr_3");
if( forn_addr_3 == null){
	System.out.println(this.toString+" : forn_addr_3 is null" );
}else{
	System.out.println(this.toString+" : forn_addr_3 is "+forn_addr_3 );
}
String tel_no_3 = req.getParameter("tel_no_3");
if( tel_no_3 == null){
	System.out.println(this.toString+" : tel_no_3 is null" );
}else{
	System.out.println(this.toString+" : tel_no_3 is "+tel_no_3 );
}
String ptph_no_3 = req.getParameter("ptph_no_3");
if( ptph_no_3 == null){
	System.out.println(this.toString+" : ptph_no_3 is null" );
}else{
	System.out.println(this.toString+" : ptph_no_3 is "+ptph_no_3 );
}
String fax_no_3 = req.getParameter("fax_no_3");
if( fax_no_3 == null){
	System.out.println(this.toString+" : fax_no_3 is null" );
}else{
	System.out.println(this.toString+" : fax_no_3 is "+fax_no_3 );
}
String addr_clsf_4 = req.getParameter("addr_clsf_4");
if( addr_clsf_4 == null){
	System.out.println(this.toString+" : addr_clsf_4 is null" );
}else{
	System.out.println(this.toString+" : addr_clsf_4 is "+addr_clsf_4 );
}
String forn_zip_4 = req.getParameter("forn_zip_4");
if( forn_zip_4 == null){
	System.out.println(this.toString+" : forn_zip_4 is null" );
}else{
	System.out.println(this.toString+" : forn_zip_4 is "+forn_zip_4 );
}
String forn_addr_4 = req.getParameter("forn_addr_4");
if( forn_addr_4 == null){
	System.out.println(this.toString+" : forn_addr_4 is null" );
}else{
	System.out.println(this.toString+" : forn_addr_4 is "+forn_addr_4 );
}
String tel_no_4 = req.getParameter("tel_no_4");
if( tel_no_4 == null){
	System.out.println(this.toString+" : tel_no_4 is null" );
}else{
	System.out.println(this.toString+" : tel_no_4 is "+tel_no_4 );
}
String ptph_no_4 = req.getParameter("ptph_no_4");
if( ptph_no_4 == null){
	System.out.println(this.toString+" : ptph_no_4 is null" );
}else{
	System.out.println(this.toString+" : ptph_no_4 is "+ptph_no_4 );
}
String fax_no_4 = req.getParameter("fax_no_4");
if( fax_no_4 == null){
	System.out.println(this.toString+" : fax_no_4 is null" );
}else{
	System.out.println(this.toString+" : fax_no_4 is "+fax_no_4 );
}
String addr_clsf_5 = req.getParameter("addr_clsf_5");
if( addr_clsf_5 == null){
	System.out.println(this.toString+" : addr_clsf_5 is null" );
}else{
	System.out.println(this.toString+" : addr_clsf_5 is "+addr_clsf_5 );
}
String tel_no_5 = req.getParameter("tel_no_5");
if( tel_no_5 == null){
	System.out.println(this.toString+" : tel_no_5 is null" );
}else{
	System.out.println(this.toString+" : tel_no_5 is "+tel_no_5 );
}
String cntc_rshp = req.getParameter("cntc_rshp");
if( cntc_rshp == null){
	System.out.println(this.toString+" : cntc_rshp is null" );
}else{
	System.out.println(this.toString+" : cntc_rshp is "+cntc_rshp );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String mode = Util.checkString(req.getParameter("mode"));
String addr_clsf_1 = Util.checkString(req.getParameter("addr_clsf_1"));
String zip_1_1 = Util.checkString(req.getParameter("zip_1_1"));
String zip_2_1 = Util.checkString(req.getParameter("zip_2_1"));
String addr_1 = Util.checkString(req.getParameter("addr_1"));
String addr_dtls_1 = Util.checkString(req.getParameter("addr_dtls_1"));
String tel_no_1 = Util.checkString(req.getParameter("tel_no_1"));
String ptph_no_1 = Util.checkString(req.getParameter("ptph_no_1"));
String fax_no_1 = Util.checkString(req.getParameter("fax_no_1"));
String addr_clsf_2 = Util.checkString(req.getParameter("addr_clsf_2"));
String zip_1_2 = Util.checkString(req.getParameter("zip_1_2"));
String zip_2_2 = Util.checkString(req.getParameter("zip_2_2"));
String addr_2 = Util.checkString(req.getParameter("addr_2"));
String addr_dtls_2 = Util.checkString(req.getParameter("addr_dtls_2"));
String tel_no_2 = Util.checkString(req.getParameter("tel_no_2"));
String ptph_no_2 = Util.checkString(req.getParameter("ptph_no_2"));
String fax_no_2 = Util.checkString(req.getParameter("fax_no_2"));
String email_id_2 = Util.checkString(req.getParameter("email_id_2"));
String addr_clsf_3 = Util.checkString(req.getParameter("addr_clsf_3"));
String forn_zip_3 = Util.checkString(req.getParameter("forn_zip_3"));
String forn_addr_3 = Util.checkString(req.getParameter("forn_addr_3"));
String tel_no_3 = Util.checkString(req.getParameter("tel_no_3"));
String ptph_no_3 = Util.checkString(req.getParameter("ptph_no_3"));
String fax_no_3 = Util.checkString(req.getParameter("fax_no_3"));
String addr_clsf_4 = Util.checkString(req.getParameter("addr_clsf_4"));
String forn_zip_4 = Util.checkString(req.getParameter("forn_zip_4"));
String forn_addr_4 = Util.checkString(req.getParameter("forn_addr_4"));
String tel_no_4 = Util.checkString(req.getParameter("tel_no_4"));
String ptph_no_4 = Util.checkString(req.getParameter("ptph_no_4"));
String fax_no_4 = Util.checkString(req.getParameter("fax_no_4"));
String addr_clsf_5 = Util.checkString(req.getParameter("addr_clsf_5"));
String tel_no_5 = Util.checkString(req.getParameter("tel_no_5"));
String cntc_rshp = Util.checkString(req.getParameter("cntc_rshp"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String addr_clsf_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_clsf_1")));
String zip_1_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_1_1")));
String zip_2_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_2_1")));
String addr_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_1")));
String addr_dtls_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_dtls_1")));
String tel_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_1")));
String ptph_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_1")));
String fax_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("fax_no_1")));
String addr_clsf_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_clsf_2")));
String zip_1_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_1_2")));
String zip_2_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_2_2")));
String addr_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_2")));
String addr_dtls_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_dtls_2")));
String tel_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_2")));
String ptph_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_2")));
String fax_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("fax_no_2")));
String email_id_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("email_id_2")));
String addr_clsf_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_clsf_3")));
String forn_zip_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("forn_zip_3")));
String forn_addr_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("forn_addr_3")));
String tel_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_3")));
String ptph_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_3")));
String fax_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("fax_no_3")));
String addr_clsf_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_clsf_4")));
String forn_zip_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("forn_zip_4")));
String forn_addr_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("forn_addr_4")));
String tel_no_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_4")));
String ptph_no_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_4")));
String fax_no_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("fax_no_4")));
String addr_clsf_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_clsf_5")));
String tel_no_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_5")));
String cntc_rshp = Util.Uni2Ksc(Util.checkString(req.getParameter("cntc_rshp")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setMode(mode);
dm.setAddr_clsf_1(addr_clsf_1);
dm.setZip_1_1(zip_1_1);
dm.setZip_2_1(zip_2_1);
dm.setAddr_1(addr_1);
dm.setAddr_dtls_1(addr_dtls_1);
dm.setTel_no_1(tel_no_1);
dm.setPtph_no_1(ptph_no_1);
dm.setFax_no_1(fax_no_1);
dm.setAddr_clsf_2(addr_clsf_2);
dm.setZip_1_2(zip_1_2);
dm.setZip_2_2(zip_2_2);
dm.setAddr_2(addr_2);
dm.setAddr_dtls_2(addr_dtls_2);
dm.setTel_no_2(tel_no_2);
dm.setPtph_no_2(ptph_no_2);
dm.setFax_no_2(fax_no_2);
dm.setEmail_id_2(email_id_2);
dm.setAddr_clsf_3(addr_clsf_3);
dm.setForn_zip_3(forn_zip_3);
dm.setForn_addr_3(forn_addr_3);
dm.setTel_no_3(tel_no_3);
dm.setPtph_no_3(ptph_no_3);
dm.setFax_no_3(fax_no_3);
dm.setAddr_clsf_4(addr_clsf_4);
dm.setForn_zip_4(forn_zip_4);
dm.setForn_addr_4(forn_addr_4);
dm.setTel_no_4(tel_no_4);
dm.setPtph_no_4(ptph_no_4);
dm.setFax_no_4(fax_no_4);
dm.setAddr_clsf_5(addr_clsf_5);
dm.setTel_no_5(tel_no_5);
dm.setCntc_rshp(cntc_rshp);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 23 19:25:41 KST 2014 */