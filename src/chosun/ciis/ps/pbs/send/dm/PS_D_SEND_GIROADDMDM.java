/***************************************************************************************************
* 파일명 : 
* 기능 :  발송-지로추가 발송처리
* 작성일자 : 2004-03-15
* 작성자 : 장수환
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * 발송-지로추가발송 발송처리
 *
 */

public class PS_D_SEND_GIROADDMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String issuseq;
	public String pers;

	public PS_D_SEND_GIROADDMDM(){}
	public PS_D_SEND_GIROADDMDM(String rdr_no, String medicd, String termsubsno, String issuseq, String pers){
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.issuseq = issuseq;
		this.pers = pers;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setIssuseq(String issuseq){
		this.issuseq = issuseq;
	}

	public void setPers(String pers){
		this.pers = pers;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getIssuseq(){
		return this.issuseq;
	}

	public String getPers(){
		return this.pers;
	}

	public String getSQL(){
		 return "{ call SP_PS_D_SEND_GIROADDM( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_D_SEND_GIROADDMDM dm = (PS_D_SEND_GIROADDMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_no);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.termsubsno);
		cstmt.setString(6, dm.issuseq);
		cstmt.setString(7, dm.pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_D_SEND_GIROADDMDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String termsubsno = req.getParameter("termsubsno");
if( termsubsno == null){
	System.out.println(this.toString+" : termsubsno is null" );
}else{
	System.out.println(this.toString+" : termsubsno is "+termsubsno );
}
String issuseq = req.getParameter("issuseq");
if( issuseq == null){
	System.out.println(this.toString+" : issuseq is null" );
}else{
	System.out.println(this.toString+" : issuseq is "+issuseq );
}
String pers = req.getParameter("pers");
if( pers == null){
	System.out.println(this.toString+" : pers is null" );
}else{
	System.out.println(this.toString+" : pers is "+pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
String issuseq = Util.checkString(req.getParameter("issuseq"));
String pers = Util.checkString(req.getParameter("pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
String issuseq = Util.Uni2Ksc(Util.checkString(req.getParameter("issuseq")));
String pers = Util.Uni2Ksc(Util.checkString(req.getParameter("pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setTermsubsno(termsubsno);
dm.setIssuseq(issuseq);
dm.setPers(pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 15 13:23:28 KST 2004 */