/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.etcpc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.ds.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_3001_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String swnm;
	public String swkind;
	public String swver;
	public String buy_dt;

	public MT_ETCPC_3001_MDM(){}
	public MT_ETCPC_3001_MDM(String cmpy_cd, String swnm, String swkind, String swver, String buy_dt){
		this.cmpy_cd = cmpy_cd;
		this.swnm = swnm;
		this.swkind = swkind;
		this.swver = swver;
		this.buy_dt = buy_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSwnm(String swnm){
		this.swnm = swnm;
	}

	public void setSwkind(String swkind){
		this.swkind = swkind;
	}

	public void setSwver(String swver){
		this.swver = swver;
	}

	public void setBuy_dt(String buy_dt){
		this.buy_dt = buy_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSwnm(){
		return this.swnm;
	}

	public String getSwkind(){
		return this.swkind;
	}

	public String getSwver(){
		return this.swver;
	}

	public String getBuy_dt(){
		return this.buy_dt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_3001_M(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_3001_MDM dm = (MT_ETCPC_3001_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.swnm);
		cstmt.setString(5, dm.swkind);
		cstmt.setString(6, dm.swver);
		cstmt.setString(7, dm.buy_dt);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_3001_MDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("swnm = " + getSwnm());
        System.out.println("swkind = " + getSwkind());
        System.out.println("swver = " + getSwver());
        System.out.println("buy_dt = " + getBuy_dt());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String swnm = req.getParameter("swnm");
if( swnm == null){
	System.out.println(this.toString+" : swnm is null" );
}else{
	System.out.println(this.toString+" : swnm is "+swnm );
}
String swkind = req.getParameter("swkind");
if( swkind == null){
	System.out.println(this.toString+" : swkind is null" );
}else{
	System.out.println(this.toString+" : swkind is "+swkind );
}
String swver = req.getParameter("swver");
if( swver == null){
	System.out.println(this.toString+" : swver is null" );
}else{
	System.out.println(this.toString+" : swver is "+swver );
}
String buy_dt = req.getParameter("buy_dt");
if( buy_dt == null){
	System.out.println(this.toString+" : buy_dt is null" );
}else{
	System.out.println(this.toString+" : buy_dt is "+buy_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String swnm = Util.checkString(req.getParameter("swnm"));
String swkind = Util.checkString(req.getParameter("swkind"));
String swver = Util.checkString(req.getParameter("swver"));
String buy_dt = Util.checkString(req.getParameter("buy_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String swnm = Util.Uni2Ksc(Util.checkString(req.getParameter("swnm")));
String swkind = Util.Uni2Ksc(Util.checkString(req.getParameter("swkind")));
String swver = Util.Uni2Ksc(Util.checkString(req.getParameter("swver")));
String buy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSwnm(swnm);
dm.setSwkind(swkind);
dm.setSwver(swver);
dm.setBuy_dt(buy_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 11:20:57 KST 2009 */