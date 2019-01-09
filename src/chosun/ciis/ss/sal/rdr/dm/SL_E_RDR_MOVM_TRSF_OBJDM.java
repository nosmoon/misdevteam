/***************************************************************************************************
* 파일명 : SL_E_RDR_MOVM_TRSF_OBJDataSet.java
* 기능 : 관할구역조정관리-인계-대상목록 추가를 위해 구역내 독자수를 구한다.
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
 * 관할구역조정관리-인계-대상목록 추가를 위해 구역내 독자수를 구한다.
 *
 */


public class SL_E_RDR_MOVM_TRSF_OBJDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String dstccd;
	public String bgndlvno;
	public String enddlvno;

	public SL_E_RDR_MOVM_TRSF_OBJDM(){}
	public SL_E_RDR_MOVM_TRSF_OBJDM(String bocd, String dstccd, String bgndlvno, String enddlvno){
		this.bocd = bocd;
		this.dstccd = dstccd;
		this.bgndlvno = bgndlvno;
		this.enddlvno = enddlvno;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
	}

	public void setBgndlvno(String bgndlvno){
		this.bgndlvno = bgndlvno;
	}

	public void setEnddlvno(String enddlvno){
		this.enddlvno = enddlvno;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getDstccd(){
		return this.dstccd;
	}

	public String getBgndlvno(){
		return this.bgndlvno;
	}

	public String getEnddlvno(){
		return this.enddlvno;
	}

	public String getSQL(){
		 return "{ call SP_SL_E_RDR_MOVM_TRSF_OBJ( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_E_RDR_MOVM_TRSF_OBJDM dm = (SL_E_RDR_MOVM_TRSF_OBJDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.dstccd);
		cstmt.setString(5, dm.bgndlvno);
		cstmt.setString(6, dm.enddlvno);
		cstmt.registerOutParameter(7, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_E_RDR_MOVM_TRSF_OBJDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String dstccd = req.getParameter("dstccd");
if( dstccd == null){
	System.out.println(this.toString+" : dstccd is null" );
}else{
	System.out.println(this.toString+" : dstccd is "+dstccd );
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

String bocd = Util.checkString(req.getParameter("bocd"));
String dstccd = Util.checkString(req.getParameter("dstccd"));
String bgndlvno = Util.checkString(req.getParameter("bgndlvno"));
String enddlvno = Util.checkString(req.getParameter("enddlvno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String dstccd = Util.Uni2Ksc(Util.checkString(req.getParameter("dstccd")));
String bgndlvno = Util.Uni2Ksc(Util.checkString(req.getParameter("bgndlvno")));
String enddlvno = Util.Uni2Ksc(Util.checkString(req.getParameter("enddlvno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setDstccd(dstccd);
dm.setBgndlvno(bgndlvno);
dm.setEnddlvno(enddlvno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 06 10:55:17 KST 2004 */