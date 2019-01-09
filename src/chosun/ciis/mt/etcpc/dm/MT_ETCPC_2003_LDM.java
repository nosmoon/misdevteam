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


public class MT_ETCPC_2003_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mchn_mang_no;
	public String modl_mang_no;
	public String buy_dt;
	public String serl_no;
	public String use_pers_flnm;
	public String aset_no;

	public MT_ETCPC_2003_LDM(){}
	public MT_ETCPC_2003_LDM(String cmpy_cd, String mchn_mang_no, String modl_mang_no, String buy_dt, String serl_no, String use_pers_flnm, String aset_no){
		this.cmpy_cd = cmpy_cd;
		this.mchn_mang_no = mchn_mang_no;
		this.modl_mang_no = modl_mang_no;
		this.buy_dt = buy_dt;
		this.serl_no = serl_no;
		this.use_pers_flnm = use_pers_flnm;
		this.aset_no = aset_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMchn_mang_no(String mchn_mang_no){
		this.mchn_mang_no = mchn_mang_no;
	}

	public void setModl_mang_no(String modl_mang_no){
		this.modl_mang_no = modl_mang_no;
	}

	public void setBuy_dt(String buy_dt){
		this.buy_dt = buy_dt;
	}

	public void setSerl_no(String serl_no){
		this.serl_no = serl_no;
	}

	public void setUse_pers_flnm(String use_pers_flnm){
		this.use_pers_flnm = use_pers_flnm;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMchn_mang_no(){
		return this.mchn_mang_no;
	}

	public String getModl_mang_no(){
		return this.modl_mang_no;
	}

	public String getBuy_dt(){
		return this.buy_dt;
	}

	public String getSerl_no(){
		return this.serl_no;
	}

	public String getUse_pers_flnm(){
		return this.use_pers_flnm;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_2003_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_2003_LDM dm = (MT_ETCPC_2003_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mchn_mang_no);
		cstmt.setString(5, dm.modl_mang_no);
		cstmt.setString(6, dm.buy_dt);
		cstmt.setString(7, dm.serl_no);
		cstmt.setString(8, dm.use_pers_flnm);
		cstmt.setString(9, dm.aset_no);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_2003_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mchn_mang_no = " + getMchn_mang_no());
        System.out.println("modl_mang_no = " + getModl_mang_no());
        System.out.println("buy_dt = " + getBuy_dt());
        System.out.println("serl_no = " + getSerl_no());
        System.out.println("use_pers_flnm = " + getUse_pers_flnm());
        System.out.println("aset_no = " + getAset_no());
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
String mchn_mang_no = req.getParameter("mchn_mang_no");
if( mchn_mang_no == null){
	System.out.println(this.toString+" : mchn_mang_no is null" );
}else{
	System.out.println(this.toString+" : mchn_mang_no is "+mchn_mang_no );
}
String modl_mang_no = req.getParameter("modl_mang_no");
if( modl_mang_no == null){
	System.out.println(this.toString+" : modl_mang_no is null" );
}else{
	System.out.println(this.toString+" : modl_mang_no is "+modl_mang_no );
}
String buy_dt = req.getParameter("buy_dt");
if( buy_dt == null){
	System.out.println(this.toString+" : buy_dt is null" );
}else{
	System.out.println(this.toString+" : buy_dt is "+buy_dt );
}
String serl_no = req.getParameter("serl_no");
if( serl_no == null){
	System.out.println(this.toString+" : serl_no is null" );
}else{
	System.out.println(this.toString+" : serl_no is "+serl_no );
}
String use_pers_flnm = req.getParameter("use_pers_flnm");
if( use_pers_flnm == null){
	System.out.println(this.toString+" : use_pers_flnm is null" );
}else{
	System.out.println(this.toString+" : use_pers_flnm is "+use_pers_flnm );
}
String aset_no = req.getParameter("aset_no");
if( aset_no == null){
	System.out.println(this.toString+" : aset_no is null" );
}else{
	System.out.println(this.toString+" : aset_no is "+aset_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mchn_mang_no = Util.checkString(req.getParameter("mchn_mang_no"));
String modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
String buy_dt = Util.checkString(req.getParameter("buy_dt"));
String serl_no = Util.checkString(req.getParameter("serl_no"));
String use_pers_flnm = Util.checkString(req.getParameter("use_pers_flnm"));
String aset_no = Util.checkString(req.getParameter("aset_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mchn_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mchn_mang_no")));
String modl_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("modl_mang_no")));
String buy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_dt")));
String serl_no = Util.Uni2Ksc(Util.checkString(req.getParameter("serl_no")));
String use_pers_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("use_pers_flnm")));
String aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMchn_mang_no(mchn_mang_no);
dm.setModl_mang_no(modl_mang_no);
dm.setBuy_dt(buy_dt);
dm.setSerl_no(serl_no);
dm.setUse_pers_flnm(use_pers_flnm);
dm.setAset_no(aset_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 23 20:41:00 KST 2009 */