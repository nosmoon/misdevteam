/***************************************************************************************************
 * 파일명   : SP_SS_L_BOSEND_LUMP
 * 기능     : 지국경영-주간조선발송관리
 * 작성일자 : 2007/04/24
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  SP_SS_L_BOSEND_LUMP
**/

public class SS_L_BOSEND_LUMPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acq_bocd;
	public String medicd;
	public String mediser_no;
	public long pageno;
	public long pagesize;

	public SS_L_BOSEND_LUMPDM(){}
	public SS_L_BOSEND_LUMPDM(String acq_bocd, String medicd, String mediser_no, long pageno, long pagesize){
		this.acq_bocd = acq_bocd;
		this.medicd = medicd;
		this.mediser_no = mediser_no;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setAcq_bocd(String acq_bocd){
		this.acq_bocd = acq_bocd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getAcq_bocd(){
		return this.acq_bocd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_BOSEND_LUMP( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_BOSEND_LUMPDM dm = (SS_L_BOSEND_LUMPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acq_bocd);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.mediser_no);
		cstmt.setLong(6, dm.pageno);
		cstmt.setLong(7, dm.pagesize);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_L_BOSEND_LUMPDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String acq_bocd = req.getParameter("acq_bocd");
if( acq_bocd == null){
	System.out.println(this.toString+" : acq_bocd is null" );
}else{
	System.out.println(this.toString+" : acq_bocd is "+acq_bocd );
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

String acq_bocd = Util.checkString(req.getParameter("acq_bocd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String mediser_no = Util.checkString(req.getParameter("mediser_no"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acq_bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("acq_bocd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String mediser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_no")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcq_bocd(acq_bocd);
dm.setMedicd(medicd);
dm.setMediser_no(mediser_no);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 24 15:43:12 KST 2007 */