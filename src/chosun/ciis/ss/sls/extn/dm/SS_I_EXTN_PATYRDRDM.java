/***************************************************************************************************
* 파일명 : .java
* 기능 : 단체확장 엑셀업로드 및 등록
* 작성일자 : 2009-06-03
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 단체확장 엑셀업로드 및 등록  
 */

public class SS_I_EXTN_PATYRDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String uid;
	public String extndt;
	public String extnflnm;
	public String pymtflnm;
	public String extn_bank_nm;
	public String extn_acc_no;
	public String extn_depositor;
	public String dept_nm;
	public String rdrnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String corrbocd;
	public String dlvhopedt;
	public String valmm;
	public String resiclsfcd;
	public String resitypecd;
	public String aplcperstel_no1;
	public String aplcperstel_no2;
	public String aplcperstel_no3;
	public String medi1;
	public String medi2;
	public String medi3;
	public String medi4;
	public String medi5;
	public String medi6;
	public String medi7;
	public String medi8;
	public String medi9;
	public String medi10;
	public String svc1;
	public String svc2;
	public String svc3;
	public String svc4;
	public String svc5;
	public String rdr_extncost;

	public SS_I_EXTN_PATYRDRDM(){}
	public SS_I_EXTN_PATYRDRDM(String cmpycd, String uid, String extndt, String extnflnm, String pymtflnm, String extn_bank_nm, String extn_acc_no, String extn_depositor, String dept_nm, String rdrnm, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String dlvzip, String dlvaddr, String dlvdtlsaddr, String corrbocd, String dlvhopedt, String valmm, String resiclsfcd, String resitypecd, String aplcperstel_no1, String aplcperstel_no2, String aplcperstel_no3, String medi1, String medi2, String medi3, String medi4, String medi5, String medi6, String medi7, String medi8, String medi9, String medi10, String svc1, String svc2, String svc3, String svc4, String svc5, String rdr_extncost){
		this.cmpycd = cmpycd;
		this.uid = uid;
		this.extndt = extndt;
		this.extnflnm = extnflnm;
		this.pymtflnm = pymtflnm;
		this.extn_bank_nm = extn_bank_nm;
		this.extn_acc_no = extn_acc_no;
		this.extn_depositor = extn_depositor;
		this.dept_nm = dept_nm;
		this.rdrnm = rdrnm;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.corrbocd = corrbocd;
		this.dlvhopedt = dlvhopedt;
		this.valmm = valmm;
		this.resiclsfcd = resiclsfcd;
		this.resitypecd = resitypecd;
		this.aplcperstel_no1 = aplcperstel_no1;
		this.aplcperstel_no2 = aplcperstel_no2;
		this.aplcperstel_no3 = aplcperstel_no3;
		this.medi1 = medi1;
		this.medi2 = medi2;
		this.medi3 = medi3;
		this.medi4 = medi4;
		this.medi5 = medi5;
		this.medi6 = medi6;
		this.medi7 = medi7;
		this.medi8 = medi8;
		this.medi9 = medi9;
		this.medi10 = medi10;
		this.svc1 = svc1;
		this.svc2 = svc2;
		this.svc3 = svc3;
		this.svc4 = svc4;
		this.svc5 = svc5;
		this.rdr_extncost = rdr_extncost;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setExtndt(String extndt){
		this.extndt = extndt;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setPymtflnm(String pymtflnm){
		this.pymtflnm = pymtflnm;
	}

	public void setExtn_bank_nm(String extn_bank_nm){
		this.extn_bank_nm = extn_bank_nm;
	}

	public void setExtn_acc_no(String extn_acc_no){
		this.extn_acc_no = extn_acc_no;
	}

	public void setExtn_depositor(String extn_depositor){
		this.extn_depositor = extn_depositor;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdrtel_no1(String rdrtel_no1){
		this.rdrtel_no1 = rdrtel_no1;
	}

	public void setRdrtel_no2(String rdrtel_no2){
		this.rdrtel_no2 = rdrtel_no2;
	}

	public void setRdrtel_no3(String rdrtel_no3){
		this.rdrtel_no3 = rdrtel_no3;
	}

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setCorrbocd(String corrbocd){
		this.corrbocd = corrbocd;
	}

	public void setDlvhopedt(String dlvhopedt){
		this.dlvhopedt = dlvhopedt;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setResiclsfcd(String resiclsfcd){
		this.resiclsfcd = resiclsfcd;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setAplcperstel_no1(String aplcperstel_no1){
		this.aplcperstel_no1 = aplcperstel_no1;
	}

	public void setAplcperstel_no2(String aplcperstel_no2){
		this.aplcperstel_no2 = aplcperstel_no2;
	}

	public void setAplcperstel_no3(String aplcperstel_no3){
		this.aplcperstel_no3 = aplcperstel_no3;
	}

	public void setMedi1(String medi1){
		this.medi1 = medi1;
	}

	public void setMedi2(String medi2){
		this.medi2 = medi2;
	}

	public void setMedi3(String medi3){
		this.medi3 = medi3;
	}

	public void setMedi4(String medi4){
		this.medi4 = medi4;
	}

	public void setMedi5(String medi5){
		this.medi5 = medi5;
	}

	public void setMedi6(String medi6){
		this.medi6 = medi6;
	}

	public void setMedi7(String medi7){
		this.medi7 = medi7;
	}

	public void setMedi8(String medi8){
		this.medi8 = medi8;
	}

	public void setMedi9(String medi9){
		this.medi9 = medi9;
	}

	public void setMedi10(String medi10){
		this.medi10 = medi10;
	}

	public void setSvc1(String svc1){
		this.svc1 = svc1;
	}

	public void setSvc2(String svc2){
		this.svc2 = svc2;
	}

	public void setSvc3(String svc3){
		this.svc3 = svc3;
	}

	public void setSvc4(String svc4){
		this.svc4 = svc4;
	}

	public void setSvc5(String svc5){
		this.svc5 = svc5;
	}

	public void setRdr_extncost(String rdr_extncost){
		this.rdr_extncost = rdr_extncost;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getExtndt(){
		return this.extndt;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getPymtflnm(){
		return this.pymtflnm;
	}

	public String getExtn_bank_nm(){
		return this.extn_bank_nm;
	}

	public String getExtn_acc_no(){
		return this.extn_acc_no;
	}

	public String getExtn_depositor(){
		return this.extn_depositor;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdrtel_no1(){
		return this.rdrtel_no1;
	}

	public String getRdrtel_no2(){
		return this.rdrtel_no2;
	}

	public String getRdrtel_no3(){
		return this.rdrtel_no3;
	}

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getCorrbocd(){
		return this.corrbocd;
	}

	public String getDlvhopedt(){
		return this.dlvhopedt;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getResiclsfcd(){
		return this.resiclsfcd;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getAplcperstel_no1(){
		return this.aplcperstel_no1;
	}

	public String getAplcperstel_no2(){
		return this.aplcperstel_no2;
	}

	public String getAplcperstel_no3(){
		return this.aplcperstel_no3;
	}

	public String getMedi1(){
		return this.medi1;
	}

	public String getMedi2(){
		return this.medi2;
	}

	public String getMedi3(){
		return this.medi3;
	}

	public String getMedi4(){
		return this.medi4;
	}

	public String getMedi5(){
		return this.medi5;
	}

	public String getMedi6(){
		return this.medi6;
	}

	public String getMedi7(){
		return this.medi7;
	}

	public String getMedi8(){
		return this.medi8;
	}

	public String getMedi9(){
		return this.medi9;
	}

	public String getMedi10(){
		return this.medi10;
	}

	public String getSvc1(){
		return this.svc1;
	}

	public String getSvc2(){
		return this.svc2;
	}

	public String getSvc3(){
		return this.svc3;
	}

	public String getSvc4(){
		return this.svc4;
	}

	public String getSvc5(){
		return this.svc5;
	}

	public String getRdr_extncost(){
		return this.rdr_extncost;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_EXTN_PATYRDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_EXTN_PATYRDRDM dm = (SS_I_EXTN_PATYRDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.uid);
		cstmt.setString(5, dm.extndt);
		cstmt.setString(6, dm.extnflnm);
		cstmt.setString(7, dm.pymtflnm);
		cstmt.setString(8, dm.extn_bank_nm);
		cstmt.setString(9, dm.extn_acc_no);
		cstmt.setString(10, dm.extn_depositor);
		cstmt.setString(11, dm.dept_nm);
		cstmt.setString(12, dm.rdrnm);
		cstmt.setString(13, dm.rdrtel_no1);
		cstmt.setString(14, dm.rdrtel_no2);
		cstmt.setString(15, dm.rdrtel_no3);
		cstmt.setString(16, dm.rdrptph_no1);
		cstmt.setString(17, dm.rdrptph_no2);
		cstmt.setString(18, dm.rdrptph_no3);
		cstmt.setString(19, dm.dlvzip);
		cstmt.setString(20, dm.dlvaddr);
		cstmt.setString(21, dm.dlvdtlsaddr);
		cstmt.setString(22, dm.corrbocd);
		cstmt.setString(23, dm.dlvhopedt);
		cstmt.setString(24, dm.valmm);
		cstmt.setString(25, dm.resiclsfcd);
		cstmt.setString(26, dm.resitypecd);
		cstmt.setString(27, dm.aplcperstel_no1);
		cstmt.setString(28, dm.aplcperstel_no2);
		cstmt.setString(29, dm.aplcperstel_no3);
		cstmt.setString(30, dm.medi1);
		cstmt.setString(31, dm.medi2);
		cstmt.setString(32, dm.medi3);
		cstmt.setString(33, dm.medi4);
		cstmt.setString(34, dm.medi5);
		cstmt.setString(35, dm.medi6);
		cstmt.setString(36, dm.medi7);
		cstmt.setString(37, dm.medi8);
		cstmt.setString(38, dm.medi9);
		cstmt.setString(39, dm.medi10);
		cstmt.setString(40, dm.svc1);
		cstmt.setString(41, dm.svc2);
		cstmt.setString(42, dm.svc3);
		cstmt.setString(43, dm.svc4);
		cstmt.setString(44, dm.svc5);
		cstmt.setString(45, dm.rdr_extncost);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_I_EXTN_PATYRDRDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String extndt = req.getParameter("extndt");
if( extndt == null){
	System.out.println(this.toString+" : extndt is null" );
}else{
	System.out.println(this.toString+" : extndt is "+extndt );
}
String extnflnm = req.getParameter("extnflnm");
if( extnflnm == null){
	System.out.println(this.toString+" : extnflnm is null" );
}else{
	System.out.println(this.toString+" : extnflnm is "+extnflnm );
}
String pymtflnm = req.getParameter("pymtflnm");
if( pymtflnm == null){
	System.out.println(this.toString+" : pymtflnm is null" );
}else{
	System.out.println(this.toString+" : pymtflnm is "+pymtflnm );
}
String extn_bank_nm = req.getParameter("extn_bank_nm");
if( extn_bank_nm == null){
	System.out.println(this.toString+" : extn_bank_nm is null" );
}else{
	System.out.println(this.toString+" : extn_bank_nm is "+extn_bank_nm );
}
String extn_acc_no = req.getParameter("extn_acc_no");
if( extn_acc_no == null){
	System.out.println(this.toString+" : extn_acc_no is null" );
}else{
	System.out.println(this.toString+" : extn_acc_no is "+extn_acc_no );
}
String extn_depositor = req.getParameter("extn_depositor");
if( extn_depositor == null){
	System.out.println(this.toString+" : extn_depositor is null" );
}else{
	System.out.println(this.toString+" : extn_depositor is "+extn_depositor );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String rdrtel_no1 = req.getParameter("rdrtel_no1");
if( rdrtel_no1 == null){
	System.out.println(this.toString+" : rdrtel_no1 is null" );
}else{
	System.out.println(this.toString+" : rdrtel_no1 is "+rdrtel_no1 );
}
String rdrtel_no2 = req.getParameter("rdrtel_no2");
if( rdrtel_no2 == null){
	System.out.println(this.toString+" : rdrtel_no2 is null" );
}else{
	System.out.println(this.toString+" : rdrtel_no2 is "+rdrtel_no2 );
}
String rdrtel_no3 = req.getParameter("rdrtel_no3");
if( rdrtel_no3 == null){
	System.out.println(this.toString+" : rdrtel_no3 is null" );
}else{
	System.out.println(this.toString+" : rdrtel_no3 is "+rdrtel_no3 );
}
String rdrptph_no1 = req.getParameter("rdrptph_no1");
if( rdrptph_no1 == null){
	System.out.println(this.toString+" : rdrptph_no1 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no1 is "+rdrptph_no1 );
}
String rdrptph_no2 = req.getParameter("rdrptph_no2");
if( rdrptph_no2 == null){
	System.out.println(this.toString+" : rdrptph_no2 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no2 is "+rdrptph_no2 );
}
String rdrptph_no3 = req.getParameter("rdrptph_no3");
if( rdrptph_no3 == null){
	System.out.println(this.toString+" : rdrptph_no3 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no3 is "+rdrptph_no3 );
}
String dlvzip = req.getParameter("dlvzip");
if( dlvzip == null){
	System.out.println(this.toString+" : dlvzip is null" );
}else{
	System.out.println(this.toString+" : dlvzip is "+dlvzip );
}
String dlvaddr = req.getParameter("dlvaddr");
if( dlvaddr == null){
	System.out.println(this.toString+" : dlvaddr is null" );
}else{
	System.out.println(this.toString+" : dlvaddr is "+dlvaddr );
}
String dlvdtlsaddr = req.getParameter("dlvdtlsaddr");
if( dlvdtlsaddr == null){
	System.out.println(this.toString+" : dlvdtlsaddr is null" );
}else{
	System.out.println(this.toString+" : dlvdtlsaddr is "+dlvdtlsaddr );
}
String corrbocd = req.getParameter("corrbocd");
if( corrbocd == null){
	System.out.println(this.toString+" : corrbocd is null" );
}else{
	System.out.println(this.toString+" : corrbocd is "+corrbocd );
}
String dlvhopedt = req.getParameter("dlvhopedt");
if( dlvhopedt == null){
	System.out.println(this.toString+" : dlvhopedt is null" );
}else{
	System.out.println(this.toString+" : dlvhopedt is "+dlvhopedt );
}
String valmm = req.getParameter("valmm");
if( valmm == null){
	System.out.println(this.toString+" : valmm is null" );
}else{
	System.out.println(this.toString+" : valmm is "+valmm );
}
String resiclsfcd = req.getParameter("resiclsfcd");
if( resiclsfcd == null){
	System.out.println(this.toString+" : resiclsfcd is null" );
}else{
	System.out.println(this.toString+" : resiclsfcd is "+resiclsfcd );
}
String resitypecd = req.getParameter("resitypecd");
if( resitypecd == null){
	System.out.println(this.toString+" : resitypecd is null" );
}else{
	System.out.println(this.toString+" : resitypecd is "+resitypecd );
}
String aplcperstel_no1 = req.getParameter("aplcperstel_no1");
if( aplcperstel_no1 == null){
	System.out.println(this.toString+" : aplcperstel_no1 is null" );
}else{
	System.out.println(this.toString+" : aplcperstel_no1 is "+aplcperstel_no1 );
}
String aplcperstel_no2 = req.getParameter("aplcperstel_no2");
if( aplcperstel_no2 == null){
	System.out.println(this.toString+" : aplcperstel_no2 is null" );
}else{
	System.out.println(this.toString+" : aplcperstel_no2 is "+aplcperstel_no2 );
}
String aplcperstel_no3 = req.getParameter("aplcperstel_no3");
if( aplcperstel_no3 == null){
	System.out.println(this.toString+" : aplcperstel_no3 is null" );
}else{
	System.out.println(this.toString+" : aplcperstel_no3 is "+aplcperstel_no3 );
}
String medi1 = req.getParameter("medi1");
if( medi1 == null){
	System.out.println(this.toString+" : medi1 is null" );
}else{
	System.out.println(this.toString+" : medi1 is "+medi1 );
}
String medi2 = req.getParameter("medi2");
if( medi2 == null){
	System.out.println(this.toString+" : medi2 is null" );
}else{
	System.out.println(this.toString+" : medi2 is "+medi2 );
}
String medi3 = req.getParameter("medi3");
if( medi3 == null){
	System.out.println(this.toString+" : medi3 is null" );
}else{
	System.out.println(this.toString+" : medi3 is "+medi3 );
}
String medi4 = req.getParameter("medi4");
if( medi4 == null){
	System.out.println(this.toString+" : medi4 is null" );
}else{
	System.out.println(this.toString+" : medi4 is "+medi4 );
}
String medi5 = req.getParameter("medi5");
if( medi5 == null){
	System.out.println(this.toString+" : medi5 is null" );
}else{
	System.out.println(this.toString+" : medi5 is "+medi5 );
}
String medi6 = req.getParameter("medi6");
if( medi6 == null){
	System.out.println(this.toString+" : medi6 is null" );
}else{
	System.out.println(this.toString+" : medi6 is "+medi6 );
}
String medi7 = req.getParameter("medi7");
if( medi7 == null){
	System.out.println(this.toString+" : medi7 is null" );
}else{
	System.out.println(this.toString+" : medi7 is "+medi7 );
}
String medi8 = req.getParameter("medi8");
if( medi8 == null){
	System.out.println(this.toString+" : medi8 is null" );
}else{
	System.out.println(this.toString+" : medi8 is "+medi8 );
}
String medi9 = req.getParameter("medi9");
if( medi9 == null){
	System.out.println(this.toString+" : medi9 is null" );
}else{
	System.out.println(this.toString+" : medi9 is "+medi9 );
}
String medi10 = req.getParameter("medi10");
if( medi10 == null){
	System.out.println(this.toString+" : medi10 is null" );
}else{
	System.out.println(this.toString+" : medi10 is "+medi10 );
}
String svc1 = req.getParameter("svc1");
if( svc1 == null){
	System.out.println(this.toString+" : svc1 is null" );
}else{
	System.out.println(this.toString+" : svc1 is "+svc1 );
}
String svc2 = req.getParameter("svc2");
if( svc2 == null){
	System.out.println(this.toString+" : svc2 is null" );
}else{
	System.out.println(this.toString+" : svc2 is "+svc2 );
}
String svc3 = req.getParameter("svc3");
if( svc3 == null){
	System.out.println(this.toString+" : svc3 is null" );
}else{
	System.out.println(this.toString+" : svc3 is "+svc3 );
}
String svc4 = req.getParameter("svc4");
if( svc4 == null){
	System.out.println(this.toString+" : svc4 is null" );
}else{
	System.out.println(this.toString+" : svc4 is "+svc4 );
}
String svc5 = req.getParameter("svc5");
if( svc5 == null){
	System.out.println(this.toString+" : svc5 is null" );
}else{
	System.out.println(this.toString+" : svc5 is "+svc5 );
}
String rdr_extncost = req.getParameter("rdr_extncost");
if( rdr_extncost == null){
	System.out.println(this.toString+" : rdr_extncost is null" );
}else{
	System.out.println(this.toString+" : rdr_extncost is "+rdr_extncost );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String uid = Util.checkString(req.getParameter("uid"));
String extndt = Util.checkString(req.getParameter("extndt"));
String extnflnm = Util.checkString(req.getParameter("extnflnm"));
String pymtflnm = Util.checkString(req.getParameter("pymtflnm"));
String extn_bank_nm = Util.checkString(req.getParameter("extn_bank_nm"));
String extn_acc_no = Util.checkString(req.getParameter("extn_acc_no"));
String extn_depositor = Util.checkString(req.getParameter("extn_depositor"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));
String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));
String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));
String dlvzip = Util.checkString(req.getParameter("dlvzip"));
String dlvaddr = Util.checkString(req.getParameter("dlvaddr"));
String dlvdtlsaddr = Util.checkString(req.getParameter("dlvdtlsaddr"));
String corrbocd = Util.checkString(req.getParameter("corrbocd"));
String dlvhopedt = Util.checkString(req.getParameter("dlvhopedt"));
String valmm = Util.checkString(req.getParameter("valmm"));
String resiclsfcd = Util.checkString(req.getParameter("resiclsfcd"));
String resitypecd = Util.checkString(req.getParameter("resitypecd"));
String aplcperstel_no1 = Util.checkString(req.getParameter("aplcperstel_no1"));
String aplcperstel_no2 = Util.checkString(req.getParameter("aplcperstel_no2"));
String aplcperstel_no3 = Util.checkString(req.getParameter("aplcperstel_no3"));
String medi1 = Util.checkString(req.getParameter("medi1"));
String medi2 = Util.checkString(req.getParameter("medi2"));
String medi3 = Util.checkString(req.getParameter("medi3"));
String medi4 = Util.checkString(req.getParameter("medi4"));
String medi5 = Util.checkString(req.getParameter("medi5"));
String medi6 = Util.checkString(req.getParameter("medi6"));
String medi7 = Util.checkString(req.getParameter("medi7"));
String medi8 = Util.checkString(req.getParameter("medi8"));
String medi9 = Util.checkString(req.getParameter("medi9"));
String medi10 = Util.checkString(req.getParameter("medi10"));
String svc1 = Util.checkString(req.getParameter("svc1"));
String svc2 = Util.checkString(req.getParameter("svc2"));
String svc3 = Util.checkString(req.getParameter("svc3"));
String svc4 = Util.checkString(req.getParameter("svc4"));
String svc5 = Util.checkString(req.getParameter("svc5"));
String rdr_extncost = Util.checkString(req.getParameter("rdr_extncost"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("extndt")));
String extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));
String pymtflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtflnm")));
String extn_bank_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_bank_nm")));
String extn_acc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_acc_no")));
String extn_depositor = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_depositor")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
String corrbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("corrbocd")));
String dlvhopedt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvhopedt")));
String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));
String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));
String aplcperstel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no1")));
String aplcperstel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no2")));
String aplcperstel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcperstel_no3")));
String medi1 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi1")));
String medi2 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi2")));
String medi3 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi3")));
String medi4 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi4")));
String medi5 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi5")));
String medi6 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi6")));
String medi7 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi7")));
String medi8 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi8")));
String medi9 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi9")));
String medi10 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi10")));
String svc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("svc1")));
String svc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("svc2")));
String svc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("svc3")));
String svc4 = Util.Uni2Ksc(Util.checkString(req.getParameter("svc4")));
String svc5 = Util.Uni2Ksc(Util.checkString(req.getParameter("svc5")));
String rdr_extncost = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncost")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setUid(uid);
dm.setExtndt(extndt);
dm.setExtnflnm(extnflnm);
dm.setPymtflnm(pymtflnm);
dm.setExtn_bank_nm(extn_bank_nm);
dm.setExtn_acc_no(extn_acc_no);
dm.setExtn_depositor(extn_depositor);
dm.setDept_nm(dept_nm);
dm.setRdrnm(rdrnm);
dm.setRdrtel_no1(rdrtel_no1);
dm.setRdrtel_no2(rdrtel_no2);
dm.setRdrtel_no3(rdrtel_no3);
dm.setRdrptph_no1(rdrptph_no1);
dm.setRdrptph_no2(rdrptph_no2);
dm.setRdrptph_no3(rdrptph_no3);
dm.setDlvzip(dlvzip);
dm.setDlvaddr(dlvaddr);
dm.setDlvdtlsaddr(dlvdtlsaddr);
dm.setCorrbocd(corrbocd);
dm.setDlvhopedt(dlvhopedt);
dm.setValmm(valmm);
dm.setResiclsfcd(resiclsfcd);
dm.setResitypecd(resitypecd);
dm.setAplcperstel_no1(aplcperstel_no1);
dm.setAplcperstel_no2(aplcperstel_no2);
dm.setAplcperstel_no3(aplcperstel_no3);
dm.setMedi1(medi1);
dm.setMedi2(medi2);
dm.setMedi3(medi3);
dm.setMedi4(medi4);
dm.setMedi5(medi5);
dm.setMedi6(medi6);
dm.setMedi7(medi7);
dm.setMedi8(medi8);
dm.setMedi9(medi9);
dm.setMedi10(medi10);
dm.setSvc1(svc1);
dm.setSvc2(svc2);
dm.setSvc3(svc3);
dm.setSvc4(svc4);
dm.setSvc5(svc5);
dm.setRdr_extncost(rdr_extncost);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 12 17:12:59 KST 2009 */