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


public class TN_LNK_1040_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String flag;
	public String onl_memb_idx;
	public String onl_prms_idx;
	public String onl_pmnt_idx;
	public String memb_cd;
	public String prms_cd;
	public String pmnt_cd;
	public String cancl_resn;
	public String remk;
	public String incmg_pers;

	public TN_LNK_1040_ADM(){}
	public TN_LNK_1040_ADM(String cmpy_cd, String flag, String onl_memb_idx, String onl_prms_idx, String onl_pmnt_idx, String memb_cd, String prms_cd, String pmnt_cd, String cancl_resn, String remk, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.flag = flag;
		this.onl_memb_idx = onl_memb_idx;
		this.onl_prms_idx = onl_prms_idx;
		this.onl_pmnt_idx = onl_pmnt_idx;
		this.memb_cd = memb_cd;
		this.prms_cd = prms_cd;
		this.pmnt_cd = pmnt_cd;
		this.cancl_resn = cancl_resn;
		this.remk = remk;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setOnl_memb_idx(String onl_memb_idx){
		this.onl_memb_idx = onl_memb_idx;
	}

	public void setOnl_prms_idx(String onl_prms_idx){
		this.onl_prms_idx = onl_prms_idx;
	}

	public void setOnl_pmnt_idx(String onl_pmnt_idx){
		this.onl_pmnt_idx = onl_pmnt_idx;
	}

	public void setMemb_cd(String memb_cd){
		this.memb_cd = memb_cd;
	}

	public void setPrms_cd(String prms_cd){
		this.prms_cd = prms_cd;
	}

	public void setPmnt_cd(String pmnt_cd){
		this.pmnt_cd = pmnt_cd;
	}

	public void setCancl_resn(String cancl_resn){
		this.cancl_resn = cancl_resn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getOnl_memb_idx(){
		return this.onl_memb_idx;
	}

	public String getOnl_prms_idx(){
		return this.onl_prms_idx;
	}

	public String getOnl_pmnt_idx(){
		return this.onl_pmnt_idx;
	}

	public String getMemb_cd(){
		return this.memb_cd;
	}

	public String getPrms_cd(){
		return this.prms_cd;
	}

	public String getPmnt_cd(){
		return this.pmnt_cd;
	}

	public String getCancl_resn(){
		return this.cancl_resn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_1040_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_1040_ADM dm = (TN_LNK_1040_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.flag);
		cstmt.setString(5, dm.onl_memb_idx);
		cstmt.setString(6, dm.onl_prms_idx);
		cstmt.setString(7, dm.onl_pmnt_idx);
		cstmt.setString(8, dm.memb_cd);
		cstmt.setString(9, dm.prms_cd);
		cstmt.setString(10, dm.pmnt_cd);
		cstmt.setString(11, dm.cancl_resn);
		cstmt.setString(12, dm.remk);
		cstmt.setString(13, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_1040_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("onl_memb_idx = [" + getOnl_memb_idx() + "]");
		System.out.println("onl_prms_idx = [" + getOnl_prms_idx() + "]");
		System.out.println("onl_pmnt_idx = [" + getOnl_pmnt_idx() + "]");
		System.out.println("memb_cd = [" + getMemb_cd() + "]");
		System.out.println("prms_cd = [" + getPrms_cd() + "]");
		System.out.println("pmnt_cd = [" + getPmnt_cd() + "]");
		System.out.println("cancl_resn = [" + getCancl_resn() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String onl_memb_idx = req.getParameter("onl_memb_idx");
if( onl_memb_idx == null){
	System.out.println(this.toString+" : onl_memb_idx is null" );
}else{
	System.out.println(this.toString+" : onl_memb_idx is "+onl_memb_idx );
}
String onl_prms_idx = req.getParameter("onl_prms_idx");
if( onl_prms_idx == null){
	System.out.println(this.toString+" : onl_prms_idx is null" );
}else{
	System.out.println(this.toString+" : onl_prms_idx is "+onl_prms_idx );
}
String onl_pmnt_idx = req.getParameter("onl_pmnt_idx");
if( onl_pmnt_idx == null){
	System.out.println(this.toString+" : onl_pmnt_idx is null" );
}else{
	System.out.println(this.toString+" : onl_pmnt_idx is "+onl_pmnt_idx );
}
String memb_cd = req.getParameter("memb_cd");
if( memb_cd == null){
	System.out.println(this.toString+" : memb_cd is null" );
}else{
	System.out.println(this.toString+" : memb_cd is "+memb_cd );
}
String prms_cd = req.getParameter("prms_cd");
if( prms_cd == null){
	System.out.println(this.toString+" : prms_cd is null" );
}else{
	System.out.println(this.toString+" : prms_cd is "+prms_cd );
}
String pmnt_cd = req.getParameter("pmnt_cd");
if( pmnt_cd == null){
	System.out.println(this.toString+" : pmnt_cd is null" );
}else{
	System.out.println(this.toString+" : pmnt_cd is "+pmnt_cd );
}
String cancl_resn = req.getParameter("cancl_resn");
if( cancl_resn == null){
	System.out.println(this.toString+" : cancl_resn is null" );
}else{
	System.out.println(this.toString+" : cancl_resn is "+cancl_resn );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String flag = Util.checkString(req.getParameter("flag"));
String onl_memb_idx = Util.checkString(req.getParameter("onl_memb_idx"));
String onl_prms_idx = Util.checkString(req.getParameter("onl_prms_idx"));
String onl_pmnt_idx = Util.checkString(req.getParameter("onl_pmnt_idx"));
String memb_cd = Util.checkString(req.getParameter("memb_cd"));
String prms_cd = Util.checkString(req.getParameter("prms_cd"));
String pmnt_cd = Util.checkString(req.getParameter("pmnt_cd"));
String cancl_resn = Util.checkString(req.getParameter("cancl_resn"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String onl_memb_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("onl_memb_idx")));
String onl_prms_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("onl_prms_idx")));
String onl_pmnt_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("onl_pmnt_idx")));
String memb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("memb_cd")));
String prms_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prms_cd")));
String pmnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pmnt_cd")));
String cancl_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("cancl_resn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFlag(flag);
dm.setOnl_memb_idx(onl_memb_idx);
dm.setOnl_prms_idx(onl_prms_idx);
dm.setOnl_pmnt_idx(onl_pmnt_idx);
dm.setMemb_cd(memb_cd);
dm.setPrms_cd(prms_cd);
dm.setPmnt_cd(pmnt_cd);
dm.setCancl_resn(cancl_resn);
dm.setRemk(remk);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 05 11:20:05 KST 2016 */