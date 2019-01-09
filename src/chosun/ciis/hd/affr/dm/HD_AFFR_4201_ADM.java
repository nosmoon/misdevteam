/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 *
 */

public class HD_AFFR_4201_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String nm_korn;
	public String prn;
	public String use_dt;
	public String use_plac;
	public String use_amt;
	public String indt_nm;
	public String indt_cd;
	public String aprv_dt;
	public String u_ipadd;
	public String u_id;
	public String mode;

	public HD_AFFR_4201_ADM(){}
	public HD_AFFR_4201_ADM(String cmpy_cd, String nm_korn, String prn, String use_dt, String use_plac, String use_amt, String indt_nm, String indt_cd, String aprv_dt, String u_ipadd, String u_id, String mode){
		this.cmpy_cd = cmpy_cd;
		this.nm_korn = nm_korn;
		this.prn = prn;
		this.use_dt = use_dt;
		this.use_plac = use_plac;
		this.use_amt = use_amt;
		this.indt_nm = indt_nm;
		this.indt_cd = indt_cd;
		this.aprv_dt = aprv_dt;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setUse_dt(String use_dt){
		this.use_dt = use_dt;
	}

	public void setUse_plac(String use_plac){
		this.use_plac = use_plac;
	}

	public void setUse_amt(String use_amt){
		this.use_amt = use_amt;
	}

	public void setIndt_nm(String indt_nm){
		this.indt_nm = indt_nm;
	}

	public void setIndt_cd(String indt_cd){
		this.indt_cd = indt_cd;
	}

	public void setAprv_dt(String aprv_dt){
		this.aprv_dt = aprv_dt;
	}

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getUse_dt(){
		return this.use_dt;
	}

	public String getUse_plac(){
		return this.use_plac;
	}

	public String getUse_amt(){
		return this.use_amt;
	}

	public String getIndt_nm(){
		return this.indt_nm;
	}

	public String getIndt_cd(){
		return this.indt_cd;
	}

	public String getAprv_dt(){
		return this.aprv_dt;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_4201_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_4201_ADM dm = (HD_AFFR_4201_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.nm_korn);
		cstmt.setString(5, dm.prn);
		cstmt.setString(6, dm.use_dt);
		cstmt.setString(7, dm.use_plac);
		cstmt.setString(8, dm.use_amt);
		cstmt.setString(9, dm.indt_nm);
		cstmt.setString(10, dm.indt_cd);
		cstmt.setString(11, dm.aprv_dt);
		cstmt.setString(12, dm.u_ipadd);
		cstmt.setString(13, dm.u_id);
		cstmt.setString(14, dm.mode);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_4201_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("nm_korn = " + getNm_korn());
        System.out.println("prn = " + getPrn());
        System.out.println("use_dt = " + getUse_dt());
        System.out.println("use_plac = " + getUse_plac());
        System.out.println("use_amt = " + getUse_amt());
        System.out.println("indt_nm = " + getIndt_nm());
        System.out.println("indt_cd = " + getIndt_cd());
        System.out.println("aprv_dt = " + getAprv_dt());
        System.out.println("u_ipadd = " + getU_ipadd());
        System.out.println("u_id = " + getU_id());
        System.out.println("mode = " + getMode());
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
String nm_korn = req.getParameter("nm_korn");
if( nm_korn == null){
	System.out.println(this.toString+" : nm_korn is null" );
}else{
	System.out.println(this.toString+" : nm_korn is "+nm_korn );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String use_dt = req.getParameter("use_dt");
if( use_dt == null){
	System.out.println(this.toString+" : use_dt is null" );
}else{
	System.out.println(this.toString+" : use_dt is "+use_dt );
}
String use_plac = req.getParameter("use_plac");
if( use_plac == null){
	System.out.println(this.toString+" : use_plac is null" );
}else{
	System.out.println(this.toString+" : use_plac is "+use_plac );
}
String use_amt = req.getParameter("use_amt");
if( use_amt == null){
	System.out.println(this.toString+" : use_amt is null" );
}else{
	System.out.println(this.toString+" : use_amt is "+use_amt );
}
String indt_nm = req.getParameter("indt_nm");
if( indt_nm == null){
	System.out.println(this.toString+" : indt_nm is null" );
}else{
	System.out.println(this.toString+" : indt_nm is "+indt_nm );
}
String indt_cd = req.getParameter("indt_cd");
if( indt_cd == null){
	System.out.println(this.toString+" : indt_cd is null" );
}else{
	System.out.println(this.toString+" : indt_cd is "+indt_cd );
}
String aprv_dt = req.getParameter("aprv_dt");
if( aprv_dt == null){
	System.out.println(this.toString+" : aprv_dt is null" );
}else{
	System.out.println(this.toString+" : aprv_dt is "+aprv_dt );
}
String u_ipadd = req.getParameter("u_ipadd");
if( u_ipadd == null){
	System.out.println(this.toString+" : u_ipadd is null" );
}else{
	System.out.println(this.toString+" : u_ipadd is "+u_ipadd );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String nm_korn = Util.checkString(req.getParameter("nm_korn"));
String prn = Util.checkString(req.getParameter("prn"));
String use_dt = Util.checkString(req.getParameter("use_dt"));
String use_plac = Util.checkString(req.getParameter("use_plac"));
String use_amt = Util.checkString(req.getParameter("use_amt"));
String indt_nm = Util.checkString(req.getParameter("indt_nm"));
String indt_cd = Util.checkString(req.getParameter("indt_cd"));
String aprv_dt = Util.checkString(req.getParameter("aprv_dt"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String nm_korn = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_korn")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String use_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dt")));
String use_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("use_plac")));
String use_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_amt")));
String indt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_nm")));
String indt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_cd")));
String aprv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_dt")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setNm_korn(nm_korn);
dm.setPrn(prn);
dm.setUse_dt(use_dt);
dm.setUse_plac(use_plac);
dm.setUse_amt(use_amt);
dm.setIndt_nm(indt_nm);
dm.setIndt_cd(indt_cd);
dm.setAprv_dt(aprv_dt);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 06 20:06:22 KST 2009 */