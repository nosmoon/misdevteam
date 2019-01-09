/***************************************************************************************************
* 파일명 : PS_L_SEPBK_CODE.java
* 기능 :  단행본 코드관리 
* 작성일자 : 2004-02-20
* 작성자 : 장수환
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.ds.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * 단행본-단행본 코드관리
 *
 */

public class PS_L_SEPBK_CODEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String medicd;
	public String mediser_no;
	public String sep_booknm;
	public long pageno;
	public long pagesize;

	public PS_L_SEPBK_CODEDM(){}
	public PS_L_SEPBK_CODEDM(String cmpycd, String medicd, String mediser_no, String sep_booknm, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.medicd = medicd;
		this.mediser_no = mediser_no;
		this.sep_booknm = sep_booknm;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setSep_booknm(String sep_booknm){
		this.sep_booknm = sep_booknm;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getSep_booknm(){
		return this.sep_booknm;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_SEPBK_CODE( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_SEPBK_CODEDM dm = (PS_L_SEPBK_CODEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.mediser_no);
		cstmt.setString(6, dm.sep_booknm);
		cstmt.setLong(7, dm.pageno);
		cstmt.setLong(8, dm.pagesize);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.code.ds.PS_L_SEPBK_CODEDataSet();
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
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String mediser_no = req.getParameter("mediser_no");
if( mediser_no == null){
	System.out.println(this.toString+" : mediser_no is null" );
}else{
	System.out.println(this.toString+" : mediser_no is "+mediser_no );
}
String sep_booknm = req.getParameter("sep_booknm");
if( sep_booknm == null){
	System.out.println(this.toString+" : sep_booknm is null" );
}else{
	System.out.println(this.toString+" : sep_booknm is "+sep_booknm );
}
String pageno = req.getParameter("pageno");
if( pageno == null){
	System.out.println(this.toString+" : pageno is null" );
}else{
	System.out.println(this.toString+" : pageno is "+pageno );
}
String pagesize = req.getParameter("pagesize");
if( pagesize == null){
	System.out.println(this.toString+" : pagesize is null" );
}else{
	System.out.println(this.toString+" : pagesize is "+pagesize );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String mediser_no = Util.checkString(req.getParameter("mediser_no"));
String sep_booknm = Util.checkString(req.getParameter("sep_booknm"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String mediser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_no")));
String sep_booknm = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_booknm")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setMedicd(medicd);
dm.setMediser_no(mediser_no);
dm.setSep_booknm(sep_booknm);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 25 19:33:09 KST 2005 */