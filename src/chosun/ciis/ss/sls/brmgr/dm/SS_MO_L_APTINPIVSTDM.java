/***************************************************************************************************
* 파일명 : SS_MO_L_APTINPIVSTDM.java
* 기능 :  저장하기 위한 아파트투입률조회(아파트형태리스트 or 투입률등록리스트)_모바일용(ciis용)
* 작성일자 : 2017-01-13
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 *
 */


public class SS_MO_L_APTINPIVSTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String addrcd;
	public String dongno;
	public String ivstdt;
	public String ivstpers;

	public SS_MO_L_APTINPIVSTDM(){}
	public SS_MO_L_APTINPIVSTDM(String bocd, String addrcd, String dongno, String ivstdt, String ivstpers){
		this.bocd = bocd;
		this.addrcd = addrcd;
		this.dongno = dongno;
		this.ivstdt = ivstdt;
		this.ivstpers = ivstpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setIvstdt(String ivstdt){
		this.ivstdt = ivstdt;
	}

	public void setIvstpers(String ivstpers){
		this.ivstpers = ivstpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getDongno(){
		return this.dongno;
	}

	public String getIvstdt(){
		return this.ivstdt;
	}

	public String getIvstpers(){
		return this.ivstpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_MO_L_APTINPIVST( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_MO_L_APTINPIVSTDM dm = (SS_MO_L_APTINPIVSTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.addrcd);
		cstmt.setString(5, dm.dongno);
		cstmt.setString(6, dm.ivstdt);
		cstmt.setString(7, dm.ivstpers);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_MO_L_APTINPIVSTDataSet();
	}



    public void print(){
        System.out.println("bocd = " + getBocd());
        System.out.println("addrcd = " + getAddrcd());
        System.out.println("dongno = " + getDongno());
        System.out.println("ivstdt = " + getIvstdt());
        System.out.println("ivstpers = " + getIvstpers());
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
String addrcd = req.getParameter("addrcd");
if( addrcd == null){
	System.out.println(this.toString+" : addrcd is null" );
}else{
	System.out.println(this.toString+" : addrcd is "+addrcd );
}
String dongno = req.getParameter("dongno");
if( dongno == null){
	System.out.println(this.toString+" : dongno is null" );
}else{
	System.out.println(this.toString+" : dongno is "+dongno );
}
String ivstdt = req.getParameter("ivstdt");
if( ivstdt == null){
	System.out.println(this.toString+" : ivstdt is null" );
}else{
	System.out.println(this.toString+" : ivstdt is "+ivstdt );
}
String ivstpers = req.getParameter("ivstpers");
if( ivstpers == null){
	System.out.println(this.toString+" : ivstpers is null" );
}else{
	System.out.println(this.toString+" : ivstpers is "+ivstpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String addrcd = Util.checkString(req.getParameter("addrcd"));
String dongno = Util.checkString(req.getParameter("dongno"));
String ivstdt = Util.checkString(req.getParameter("ivstdt"));
String ivstpers = Util.checkString(req.getParameter("ivstpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));
String ivstdt = Util.Uni2Ksc(Util.checkString(req.getParameter("ivstdt")));
String ivstpers = Util.Uni2Ksc(Util.checkString(req.getParameter("ivstpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setAddrcd(addrcd);
dm.setDongno(dongno);
dm.setIvstdt(ivstdt);
dm.setIvstpers(ivstpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 13 16:24:08 KST 2017 */