/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_2040_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cmsidx;
	public String chg_pers_addr;
	public String chg_pers;

	public TN_LNK_2040_ADM(){}
	public TN_LNK_2040_ADM(String cmpy_cd, String cmsidx, String chg_pers_addr, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.cmsidx = cmsidx;
		this.chg_pers_addr = chg_pers_addr;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCmsidx(String cmsidx){
		this.cmsidx = cmsidx;
	}

	public void setChg_pers_addr(String chg_pers_addr){
		this.chg_pers_addr = chg_pers_addr;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCmsidx(){
		return this.cmsidx;
	}

	public String getChg_pers_addr(){
		return this.chg_pers_addr;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_2040_A(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_2040_ADM dm = (TN_LNK_2040_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cmsidx);
		cstmt.setString(5, dm.chg_pers_addr);
		cstmt.setString(6, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_2040_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cmsidx = [" + getCmsidx() + "]");
		System.out.println("chg_pers_addr = [" + getChg_pers_addr() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String cmsidx = req.getParameter("cmsidx");
if( cmsidx == null){
	System.out.println(this.toString+" : cmsidx is null" );
}else{
	System.out.println(this.toString+" : cmsidx is "+cmsidx );
}
String chg_pers_addr = req.getParameter("chg_pers_addr");
if( chg_pers_addr == null){
	System.out.println(this.toString+" : chg_pers_addr is null" );
}else{
	System.out.println(this.toString+" : chg_pers_addr is "+chg_pers_addr );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cmsidx = Util.checkString(req.getParameter("cmsidx"));
String chg_pers_addr = Util.checkString(req.getParameter("chg_pers_addr"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cmsidx = Util.Uni2Ksc(Util.checkString(req.getParameter("cmsidx")));
String chg_pers_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers_addr")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCmsidx(cmsidx);
dm.setChg_pers_addr(chg_pers_addr);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 20 19:50:43 KST 2016 */