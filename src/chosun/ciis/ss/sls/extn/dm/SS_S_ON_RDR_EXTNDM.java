/***************************************************************************************************
 * 파일명   : SP_SS_S_ON_RDR_EXTN
 * 기능     : 확장현황-온라인확장 신청 상세
 * 작성일자 : 2007/06/12
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
**  SP_SS_S_ON_RDR_EXTN
**/

public class SS_S_ON_RDR_EXTNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_extntypecd;
	public String aplcpathcd;
	public String rdr_extndt;
	public String rdr_extnno;
	public String rdr_no;
	public String medicd;
	public String cntrno;
	public String mangno;
	public String boheadcnfmyn;

	public SS_S_ON_RDR_EXTNDM(){}
	public SS_S_ON_RDR_EXTNDM(String rdr_extntypecd, String aplcpathcd, String rdr_extndt, String rdr_extnno, String rdr_no, String medicd, String cntrno, String mangno, String boheadcnfmyn){
		this.rdr_extntypecd = rdr_extntypecd;
		this.aplcpathcd = aplcpathcd;
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.cntrno = cntrno;
		this.mangno = mangno;
		this.boheadcnfmyn = boheadcnfmyn;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCntrno(String cntrno){
		this.cntrno = cntrno;
	}

	public void setMangno(String mangno){
		this.mangno = mangno;
	}

	public void setBoheadcnfmyn(String boheadcnfmyn){
		this.boheadcnfmyn = boheadcnfmyn;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCntrno(){
		return this.cntrno;
	}

	public String getMangno(){
		return this.mangno;
	}

	public String getBoheadcnfmyn(){
		return this.boheadcnfmyn;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_ON_RDR_EXTN( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_ON_RDR_EXTNDM dm = (SS_S_ON_RDR_EXTNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_extntypecd);
		cstmt.setString(4, dm.aplcpathcd);
		cstmt.setString(5, dm.rdr_extndt);
		cstmt.setString(6, dm.rdr_extnno);
		cstmt.setString(7, dm.rdr_no);
		cstmt.setString(8, dm.medicd);
		cstmt.setString(9, dm.cntrno);
		cstmt.setString(10, dm.mangno);
		cstmt.setString(11, dm.boheadcnfmyn);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.INTEGER);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, Types.VARCHAR);
		cstmt.registerOutParameter(24, Types.VARCHAR);
		cstmt.registerOutParameter(25, Types.VARCHAR);
		cstmt.registerOutParameter(26, Types.VARCHAR);
		cstmt.registerOutParameter(27, Types.VARCHAR);
		cstmt.registerOutParameter(28, Types.VARCHAR);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, Types.VARCHAR);
		cstmt.registerOutParameter(31, Types.VARCHAR);
		cstmt.registerOutParameter(32, Types.VARCHAR);
		cstmt.registerOutParameter(33, Types.VARCHAR);
		cstmt.registerOutParameter(34, Types.VARCHAR);
		cstmt.registerOutParameter(35, Types.VARCHAR);
		cstmt.registerOutParameter(36, Types.VARCHAR);
		cstmt.registerOutParameter(37, Types.VARCHAR);
		cstmt.registerOutParameter(38, Types.VARCHAR);
		cstmt.registerOutParameter(39, Types.VARCHAR);
		cstmt.registerOutParameter(40, Types.VARCHAR);
		cstmt.registerOutParameter(41, Types.VARCHAR);
		cstmt.registerOutParameter(42, Types.VARCHAR);
		cstmt.registerOutParameter(43, Types.VARCHAR);
		cstmt.registerOutParameter(44, Types.VARCHAR);
		cstmt.registerOutParameter(45, Types.VARCHAR);
		cstmt.registerOutParameter(46, Types.VARCHAR);
		cstmt.registerOutParameter(47, Types.VARCHAR);
		cstmt.registerOutParameter(48, Types.VARCHAR);
		cstmt.registerOutParameter(49, Types.VARCHAR);
		cstmt.registerOutParameter(50, Types.VARCHAR);
		cstmt.registerOutParameter(51, Types.VARCHAR);
		cstmt.registerOutParameter(52, Types.VARCHAR);
		cstmt.registerOutParameter(53, Types.VARCHAR);
		cstmt.registerOutParameter(54, Types.VARCHAR);
		cstmt.registerOutParameter(55, Types.VARCHAR);
		cstmt.registerOutParameter(56, Types.VARCHAR);
		cstmt.registerOutParameter(57, Types.VARCHAR);
		cstmt.registerOutParameter(58, Types.VARCHAR);
		cstmt.registerOutParameter(59, Types.VARCHAR);
		cstmt.registerOutParameter(60, Types.VARCHAR);
		cstmt.registerOutParameter(61, Types.VARCHAR);
		cstmt.registerOutParameter(62, Types.VARCHAR);
		cstmt.registerOutParameter(63, Types.VARCHAR);
		cstmt.registerOutParameter(64, Types.VARCHAR);
		cstmt.registerOutParameter(65, Types.VARCHAR);
		cstmt.registerOutParameter(66, Types.VARCHAR);
		cstmt.registerOutParameter(67, Types.VARCHAR);
		cstmt.registerOutParameter(68, Types.VARCHAR);
		cstmt.registerOutParameter(69, Types.VARCHAR);
		cstmt.registerOutParameter(70, Types.VARCHAR);
		cstmt.registerOutParameter(71, Types.VARCHAR);
		cstmt.registerOutParameter(72, Types.VARCHAR);
		cstmt.registerOutParameter(73, Types.VARCHAR);
		cstmt.registerOutParameter(74, Types.VARCHAR);
		cstmt.registerOutParameter(75, Types.VARCHAR);
		cstmt.registerOutParameter(76, Types.VARCHAR);
		cstmt.registerOutParameter(77, Types.VARCHAR);
		cstmt.registerOutParameter(78, Types.VARCHAR);
		cstmt.registerOutParameter(79, Types.VARCHAR);
		cstmt.registerOutParameter(80, Types.VARCHAR);
		cstmt.registerOutParameter(81, Types.VARCHAR);
		cstmt.registerOutParameter(82, Types.VARCHAR);
		cstmt.registerOutParameter(83, Types.VARCHAR);
		cstmt.registerOutParameter(84, Types.VARCHAR);
		cstmt.registerOutParameter(85, Types.VARCHAR);
		cstmt.registerOutParameter(86, Types.VARCHAR);
		cstmt.registerOutParameter(87, Types.VARCHAR);
		cstmt.registerOutParameter(88, Types.VARCHAR);
		cstmt.registerOutParameter(89, Types.TIMESTAMP);
		cstmt.registerOutParameter(90, Types.VARCHAR);
		cstmt.registerOutParameter(91, Types.TIMESTAMP);
		cstmt.registerOutParameter(92, Types.VARCHAR);
		cstmt.registerOutParameter(93, Types.VARCHAR);
		cstmt.registerOutParameter(94, Types.VARCHAR);
		cstmt.registerOutParameter(95, Types.VARCHAR);
		cstmt.registerOutParameter(96, Types.VARCHAR);
		cstmt.registerOutParameter(97, Types.VARCHAR);
		cstmt.registerOutParameter(98, Types.VARCHAR);
		cstmt.registerOutParameter(99, Types.VARCHAR);
		cstmt.registerOutParameter(100, Types.VARCHAR);
		cstmt.registerOutParameter(101, Types.VARCHAR);
		cstmt.registerOutParameter(102, Types.VARCHAR);
		cstmt.registerOutParameter(103, Types.VARCHAR);
		cstmt.registerOutParameter(104, Types.VARCHAR);
		cstmt.registerOutParameter(105, Types.VARCHAR);
		cstmt.registerOutParameter(106, Types.VARCHAR);
		cstmt.registerOutParameter(107, Types.VARCHAR);
		cstmt.registerOutParameter(108, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_S_ON_RDR_EXTNDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String rdr_extntypecd = req.getParameter("rdr_extntypecd");
if( rdr_extntypecd == null){
	System.out.println(this.toString+" : rdr_extntypecd is null" );
}else{
	System.out.println(this.toString+" : rdr_extntypecd is "+rdr_extntypecd );
}
String aplcpathcd = req.getParameter("aplcpathcd");
if( aplcpathcd == null){
	System.out.println(this.toString+" : aplcpathcd is null" );
}else{
	System.out.println(this.toString+" : aplcpathcd is "+aplcpathcd );
}
String rdr_extndt = req.getParameter("rdr_extndt");
if( rdr_extndt == null){
	System.out.println(this.toString+" : rdr_extndt is null" );
}else{
	System.out.println(this.toString+" : rdr_extndt is "+rdr_extndt );
}
String rdr_extnno = req.getParameter("rdr_extnno");
if( rdr_extnno == null){
	System.out.println(this.toString+" : rdr_extnno is null" );
}else{
	System.out.println(this.toString+" : rdr_extnno is "+rdr_extnno );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String cntrno = req.getParameter("cntrno");
if( cntrno == null){
	System.out.println(this.toString+" : cntrno is null" );
}else{
	System.out.println(this.toString+" : cntrno is "+cntrno );
}
String mangno = req.getParameter("mangno");
if( mangno == null){
	System.out.println(this.toString+" : mangno is null" );
}else{
	System.out.println(this.toString+" : mangno is "+mangno );
}
String boheadcnfmyn = req.getParameter("boheadcnfmyn");
if( boheadcnfmyn == null){
	System.out.println(this.toString+" : boheadcnfmyn is null" );
}else{
	System.out.println(this.toString+" : boheadcnfmyn is "+boheadcnfmyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String rdr_extntypecd = Util.checkString(req.getParameter("rdr_extntypecd"));
String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String cntrno = Util.checkString(req.getParameter("cntrno"));
String mangno = Util.checkString(req.getParameter("mangno"));
String boheadcnfmyn = Util.checkString(req.getParameter("boheadcnfmyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String cntrno = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrno")));
String mangno = Util.Uni2Ksc(Util.checkString(req.getParameter("mangno")));
String boheadcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("boheadcnfmyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRdr_extntypecd(rdr_extntypecd);
dm.setAplcpathcd(aplcpathcd);
dm.setRdr_extndt(rdr_extndt);
dm.setRdr_extnno(rdr_extnno);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setCntrno(cntrno);
dm.setMangno(mangno);
dm.setBoheadcnfmyn(boheadcnfmyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 14 14:18:10 KST 2007 */