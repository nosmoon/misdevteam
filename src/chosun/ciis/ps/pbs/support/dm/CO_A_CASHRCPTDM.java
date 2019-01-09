/***************************************************************************************************
* 파일명 : CO_A_CASHRCPT.java
* 기능   : 불편관리 - 현금영수증 신청/취소
* 작성일자 : 2005-12-19
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.support.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.ds.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * 불편관리 - 현금영수증 신청/취소
 *
 */

public class CO_A_CASHRCPTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String rdr_no;
	public String selpubclsf;
	public String aplcpers;
	public String prn;
	public String ptphno1;
	public String ptphno2;
	public String ptphno3;
	public String rcptclsf;
	public String aplcpath;
	public String incmgpers;

	public CO_A_CASHRCPTDM(){}
	public CO_A_CASHRCPTDM(String flag, String rdr_no, String selpubclsf, String aplcpers, String prn, String ptphno1, String ptphno2, String ptphno3, String rcptclsf, String aplcpath, String incmgpers){
		this.flag = flag;
		this.rdr_no = rdr_no;
		this.selpubclsf = selpubclsf;
		this.aplcpers = aplcpers;
		this.prn = prn;
		this.ptphno1 = ptphno1;
		this.ptphno2 = ptphno2;
		this.ptphno3 = ptphno3;
		this.rcptclsf = rcptclsf;
		this.aplcpath = aplcpath;
		this.incmgpers = incmgpers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setSelpubclsf(String selpubclsf){
		this.selpubclsf = selpubclsf;
	}

	public void setAplcpers(String aplcpers){
		this.aplcpers = aplcpers;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPtphno1(String ptphno1){
		this.ptphno1 = ptphno1;
	}

	public void setPtphno2(String ptphno2){
		this.ptphno2 = ptphno2;
	}

	public void setPtphno3(String ptphno3){
		this.ptphno3 = ptphno3;
	}

	public void setRcptclsf(String rcptclsf){
		this.rcptclsf = rcptclsf;
	}

	public void setAplcpath(String aplcpath){
		this.aplcpath = aplcpath;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getSelpubclsf(){
		return this.selpubclsf;
	}

	public String getAplcpers(){
		return this.aplcpers;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getPtphno1(){
		return this.ptphno1;
	}

	public String getPtphno2(){
		return this.ptphno2;
	}

	public String getPtphno3(){
		return this.ptphno3;
	}

	public String getRcptclsf(){
		return this.rcptclsf;
	}

	public String getAplcpath(){
		return this.aplcpath;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_CO_A_CASHRCPT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_A_CASHRCPTDM dm = (CO_A_CASHRCPTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.rdr_no);
		cstmt.setString(5, dm.selpubclsf);
		cstmt.setString(6, dm.aplcpers);
		cstmt.setString(7, dm.prn);
		cstmt.setString(8, dm.ptphno1);
		cstmt.setString(9, dm.ptphno2);
		cstmt.setString(10, dm.ptphno3);
		cstmt.setString(11, dm.rcptclsf);
		cstmt.setString(12, dm.aplcpath);
		cstmt.setString(13, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.support.ds.CO_A_CASHRCPTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String selpubclsf = req.getParameter("selpubclsf");
if( selpubclsf == null){
	System.out.println(this.toString+" : selpubclsf is null" );
}else{
	System.out.println(this.toString+" : selpubclsf is "+selpubclsf );
}
String aplcpers = req.getParameter("aplcpers");
if( aplcpers == null){
	System.out.println(this.toString+" : aplcpers is null" );
}else{
	System.out.println(this.toString+" : aplcpers is "+aplcpers );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String ptphno1 = req.getParameter("ptphno1");
if( ptphno1 == null){
	System.out.println(this.toString+" : ptphno1 is null" );
}else{
	System.out.println(this.toString+" : ptphno1 is "+ptphno1 );
}
String ptphno2 = req.getParameter("ptphno2");
if( ptphno2 == null){
	System.out.println(this.toString+" : ptphno2 is null" );
}else{
	System.out.println(this.toString+" : ptphno2 is "+ptphno2 );
}
String ptphno3 = req.getParameter("ptphno3");
if( ptphno3 == null){
	System.out.println(this.toString+" : ptphno3 is null" );
}else{
	System.out.println(this.toString+" : ptphno3 is "+ptphno3 );
}
String rcptclsf = req.getParameter("rcptclsf");
if( rcptclsf == null){
	System.out.println(this.toString+" : rcptclsf is null" );
}else{
	System.out.println(this.toString+" : rcptclsf is "+rcptclsf );
}
String aplcpath = req.getParameter("aplcpath");
if( aplcpath == null){
	System.out.println(this.toString+" : aplcpath is null" );
}else{
	System.out.println(this.toString+" : aplcpath is "+aplcpath );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String selpubclsf = Util.checkString(req.getParameter("selpubclsf"));
String aplcpers = Util.checkString(req.getParameter("aplcpers"));
String prn = Util.checkString(req.getParameter("prn"));
String ptphno1 = Util.checkString(req.getParameter("ptphno1"));
String ptphno2 = Util.checkString(req.getParameter("ptphno2"));
String ptphno3 = Util.checkString(req.getParameter("ptphno3"));
String rcptclsf = Util.checkString(req.getParameter("rcptclsf"));
String aplcpath = Util.checkString(req.getParameter("aplcpath"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String selpubclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("selpubclsf")));
String aplcpers = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpers")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String ptphno1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptphno1")));
String ptphno2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptphno2")));
String ptphno3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptphno3")));
String rcptclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcptclsf")));
String aplcpath = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpath")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setRdr_no(rdr_no);
dm.setSelpubclsf(selpubclsf);
dm.setAplcpers(aplcpers);
dm.setPrn(prn);
dm.setPtphno1(ptphno1);
dm.setPtphno2(ptphno2);
dm.setPtphno3(ptphno3);
dm.setRcptclsf(rcptclsf);
dm.setAplcpath(aplcpath);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 02 18:48:05 KST 2006 */