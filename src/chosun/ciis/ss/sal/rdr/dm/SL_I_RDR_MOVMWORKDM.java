/***************************************************************************************************
* 파일명 : SL_I_RDR_MOVMWORKDM.java
* 기능 : 관할지국조정관리-인계처리
* 작성일자 : 2004-02-06
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 관할지국조정관리-인계처리
 *
 */


public class SL_I_RDR_MOVMWORKDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String trsfbocd;
	public String acptbocd;
	public String dstccd;
	public String dstcnm;
	public String rdrcnt;
	public String bgndlvno;
	public String enddlvno;

	public SL_I_RDR_MOVMWORKDM(){}
	public SL_I_RDR_MOVMWORKDM(String incmgpers, String trsfbocd, String acptbocd, String dstccd, String dstcnm, String rdrcnt, String bgndlvno, String enddlvno){
		this.incmgpers = incmgpers;
		this.trsfbocd = trsfbocd;
		this.acptbocd = acptbocd;
		this.dstccd = dstccd;
		this.dstcnm = dstcnm;
		this.rdrcnt = rdrcnt;
		this.bgndlvno = bgndlvno;
		this.enddlvno = enddlvno;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setTrsfbocd(String trsfbocd){
		this.trsfbocd = trsfbocd;
	}

	public void setAcptbocd(String acptbocd){
		this.acptbocd = acptbocd;
	}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
	}

	public void setDstcnm(String dstcnm){
		this.dstcnm = dstcnm;
	}

	public void setRdrcnt(String rdrcnt){
		this.rdrcnt = rdrcnt;
	}

	public void setBgndlvno(String bgndlvno){
		this.bgndlvno = bgndlvno;
	}

	public void setEnddlvno(String enddlvno){
		this.enddlvno = enddlvno;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getTrsfbocd(){
		return this.trsfbocd;
	}

	public String getAcptbocd(){
		return this.acptbocd;
	}

	public String getDstccd(){
		return this.dstccd;
	}

	public String getDstcnm(){
		return this.dstcnm;
	}

	public String getRdrcnt(){
		return this.rdrcnt;
	}

	public String getBgndlvno(){
		return this.bgndlvno;
	}

	public String getEnddlvno(){
		return this.enddlvno;
	}

	public String getSQL(){
		 return "{ call SP_SL_I_RDR_MOVMWORK( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_I_RDR_MOVMWORKDM dm = (SL_I_RDR_MOVMWORKDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.trsfbocd);
		cstmt.setString(5, dm.acptbocd);
		cstmt.setString(6, dm.dstccd);
		cstmt.setString(7, dm.dstcnm);
		cstmt.setString(8, dm.rdrcnt);
		cstmt.setString(9, dm.bgndlvno);
		cstmt.setString(10, dm.enddlvno);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_I_RDR_MOVMWORKDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String trsfbocd = req.getParameter("trsfbocd");
if( trsfbocd == null){
	System.out.println(this.toString+" : trsfbocd is null" );
}else{
	System.out.println(this.toString+" : trsfbocd is "+trsfbocd );
}
String acptbocd = req.getParameter("acptbocd");
if( acptbocd == null){
	System.out.println(this.toString+" : acptbocd is null" );
}else{
	System.out.println(this.toString+" : acptbocd is "+acptbocd );
}
String dstccd = req.getParameter("dstccd");
if( dstccd == null){
	System.out.println(this.toString+" : dstccd is null" );
}else{
	System.out.println(this.toString+" : dstccd is "+dstccd );
}
String dstcnm = req.getParameter("dstcnm");
if( dstcnm == null){
	System.out.println(this.toString+" : dstcnm is null" );
}else{
	System.out.println(this.toString+" : dstcnm is "+dstcnm );
}
String rdrcnt = req.getParameter("rdrcnt");
if( rdrcnt == null){
	System.out.println(this.toString+" : rdrcnt is null" );
}else{
	System.out.println(this.toString+" : rdrcnt is "+rdrcnt );
}
String bgndlvno = req.getParameter("bgndlvno");
if( bgndlvno == null){
	System.out.println(this.toString+" : bgndlvno is null" );
}else{
	System.out.println(this.toString+" : bgndlvno is "+bgndlvno );
}
String enddlvno = req.getParameter("enddlvno");
if( enddlvno == null){
	System.out.println(this.toString+" : enddlvno is null" );
}else{
	System.out.println(this.toString+" : enddlvno is "+enddlvno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String trsfbocd = Util.checkString(req.getParameter("trsfbocd"));
String acptbocd = Util.checkString(req.getParameter("acptbocd"));
String dstccd = Util.checkString(req.getParameter("dstccd"));
String dstcnm = Util.checkString(req.getParameter("dstcnm"));
String rdrcnt = Util.checkString(req.getParameter("rdrcnt"));
String bgndlvno = Util.checkString(req.getParameter("bgndlvno"));
String enddlvno = Util.checkString(req.getParameter("enddlvno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String trsfbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("trsfbocd")));
String acptbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("acptbocd")));
String dstccd = Util.Uni2Ksc(Util.checkString(req.getParameter("dstccd")));
String dstcnm = Util.Uni2Ksc(Util.checkString(req.getParameter("dstcnm")));
String rdrcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrcnt")));
String bgndlvno = Util.Uni2Ksc(Util.checkString(req.getParameter("bgndlvno")));
String enddlvno = Util.Uni2Ksc(Util.checkString(req.getParameter("enddlvno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setTrsfbocd(trsfbocd);
dm.setAcptbocd(acptbocd);
dm.setDstccd(dstccd);
dm.setDstcnm(dstcnm);
dm.setRdrcnt(rdrcnt);
dm.setBgndlvno(bgndlvno);
dm.setEnddlvno(enddlvno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 06 21:06:44 KST 2004 */