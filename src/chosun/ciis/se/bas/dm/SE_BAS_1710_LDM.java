/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.ds.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_yymm_fr;
	public String aply_yymm_to;
	public String medi_cd;
	public String sell_net_clsf;

	public SE_BAS_1710_LDM(){}
	public SE_BAS_1710_LDM(String cmpy_cd, String aply_yymm_fr, String aply_yymm_to, String medi_cd, String sell_net_clsf){
		this.cmpy_cd = cmpy_cd;
		this.aply_yymm_fr = aply_yymm_fr;
		this.aply_yymm_to = aply_yymm_to;
		this.medi_cd = medi_cd;
		this.sell_net_clsf = sell_net_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_yymm_fr(String aply_yymm_fr){
		this.aply_yymm_fr = aply_yymm_fr;
	}

	public void setAply_yymm_to(String aply_yymm_to){
		this.aply_yymm_to = aply_yymm_to;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}
	
	public void setSell_net_clsf(String sell_net_clsf){
		this.sell_net_clsf = sell_net_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_yymm_fr(){
		return this.aply_yymm_fr;
	}

	public String getAply_yymm_to(){
		return this.aply_yymm_to;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}
	
	public String getSell_net_clsf(){
		return this.sell_net_clsf;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BAS_1710_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BAS_1710_LDM dm = (SE_BAS_1710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aply_yymm_fr);
		cstmt.setString(5, dm.aply_yymm_to);
		cstmt.setString(6, dm.medi_cd);
		cstmt.setString(7, dm.sell_net_clsf);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bas.ds.SE_BAS_1710_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aply_yymm_fr = [" + getAply_yymm_fr() + "]");
		System.out.println("aply_yymm_to = [" + getAply_yymm_to() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sell_net_clsf = [" + getSell_net_clsf() + "]");
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
String aply_yymm_fr = req.getParameter("aply_yymm_fr");
if( aply_yymm_fr == null){
	System.out.println(this.toString+" : aply_yymm_fr is null" );
}else{
	System.out.println(this.toString+" : aply_yymm_fr is "+aply_yymm_fr );
}
String aply_yymm_to = req.getParameter("aply_yymm_to");
if( aply_yymm_to == null){
	System.out.println(this.toString+" : aply_yymm_to is null" );
}else{
	System.out.println(this.toString+" : aply_yymm_to is "+aply_yymm_to );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_yymm_fr = Util.checkString(req.getParameter("aply_yymm_fr"));
String aply_yymm_to = Util.checkString(req.getParameter("aply_yymm_to"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yymm_fr")));
String aply_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yymm_to")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAply_yymm_fr(aply_yymm_fr);
dm.setAply_yymm_to(aply_yymm_to);
dm.setMedi_cd(medi_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 27 16:24:20 KST 2014 */