/***************************************************************************************************
* 파일명 : SL_L_APTDLV_LISTDM.java
* 기능 :  해당지국의아파트 배달카드 조회_모바일용(ciis용)
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


public class SS_L_APTDLV_LISTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String medicd;
	public String addrcd;
	public String dongno;
	public long stho;
	public long edho;

	public SS_L_APTDLV_LISTDM(){}
	public SS_L_APTDLV_LISTDM(String bocd, String medicd, String addrcd, String dongno, long stho, long edho){
		this.bocd = bocd;
		this.medicd = medicd;
		this.addrcd = addrcd;
		this.dongno = dongno;
		this.stho = stho;
		this.edho = edho;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setStho(long stho){
		this.stho = stho;
	}

	public void setEdho(long edho){
		this.edho = edho;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getDongno(){
		return this.dongno;
	}

	public long getStho(){
		return this.stho;
	}

	public long getEdho(){
		return this.edho;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_APTDLV_LIST( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_APTDLV_LISTDM dm = (SS_L_APTDLV_LISTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.addrcd);
		cstmt.setString(6, dm.dongno);
		cstmt.setLong(7, dm.stho);
		cstmt.setLong(8, dm.edho);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_L_APTDLV_LISTDataSet();
	}



    public void print(){
        System.out.println("bocd = " + getBocd());
        System.out.println("medicd = " + getMedicd());
        System.out.println("addrcd = " + getAddrcd());
        System.out.println("dongno = " + getDongno());
        System.out.println("stho = " + getStho());
        System.out.println("edho = " + getEdho());
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
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
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
String stho = req.getParameter("stho");
if( stho == null){
	System.out.println(this.toString+" : stho is null" );
}else{
	System.out.println(this.toString+" : stho is "+stho );
}
String edho = req.getParameter("edho");
if( edho == null){
	System.out.println(this.toString+" : edho is null" );
}else{
	System.out.println(this.toString+" : edho is "+edho );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String addrcd = Util.checkString(req.getParameter("addrcd"));
String dongno = Util.checkString(req.getParameter("dongno"));
String stho = Util.checkString(req.getParameter("stho"));
String edho = Util.checkString(req.getParameter("edho"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));
String stho = Util.Uni2Ksc(Util.checkString(req.getParameter("stho")));
String edho = Util.Uni2Ksc(Util.checkString(req.getParameter("edho")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setMedicd(medicd);
dm.setAddrcd(addrcd);
dm.setDongno(dongno);
dm.setStho(stho);
dm.setEdho(edho);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 13 15:30:46 KST 2017 */