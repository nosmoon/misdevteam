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


package chosun.ciis.mt.prnpap.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.ds.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_3414_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String issu_dt;
	public String prt_dt;
	public String hdqt_paper_clsf;
	public String pj_kind;
	public String cnt;
	public String wgt;
	public String pre_prt_clsf;
	public String pers_ipaddr;
	public String pers_id;

	public MT_PRNPAP_3414_IDM(){}
	public MT_PRNPAP_3414_IDM(String cmpy_cd, String fac_clsf, String medi_cd, String sect_cd, String issu_dt, String prt_dt, String hdqt_paper_clsf, String pj_kind, String cnt, String wgt, String pre_prt_clsf, String pers_ipaddr, String pers_id){
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.issu_dt = issu_dt;
		this.prt_dt = prt_dt;
		this.hdqt_paper_clsf = hdqt_paper_clsf;
		this.pj_kind = pj_kind;
		this.cnt = cnt;
		this.wgt = wgt;
		this.pre_prt_clsf = pre_prt_clsf;
		this.pers_ipaddr = pers_ipaddr;
		this.pers_id = pers_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setHdqt_paper_clsf(String hdqt_paper_clsf){
		this.hdqt_paper_clsf = hdqt_paper_clsf;
	}

	public void setPj_kind(String pj_kind){
		this.pj_kind = pj_kind;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public void setPre_prt_clsf(String pre_prt_clsf){
		this.pre_prt_clsf = pre_prt_clsf;
	}

	public void setPers_ipaddr(String pers_ipaddr){
		this.pers_ipaddr = pers_ipaddr;
	}

	public void setPers_id(String pers_id){
		this.pers_id = pers_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getHdqt_paper_clsf(){
		return this.hdqt_paper_clsf;
	}

	public String getPj_kind(){
		return this.pj_kind;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getWgt(){
		return this.wgt;
	}

	public String getPre_prt_clsf(){
		return this.pre_prt_clsf;
	}

	public String getPers_ipaddr(){
		return this.pers_ipaddr;
	}

	public String getPers_id(){
		return this.pers_id;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PRNPAP_3414_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PRNPAP_3414_IDM dm = (MT_PRNPAP_3414_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fac_clsf);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.sect_cd);
		cstmt.setString(7, dm.issu_dt);
		cstmt.setString(8, dm.prt_dt);
		cstmt.setString(9, dm.hdqt_paper_clsf);
		cstmt.setString(10, dm.pj_kind);
		cstmt.setString(11, dm.cnt);
		cstmt.setString(12, dm.wgt);
		cstmt.setString(13, dm.pre_prt_clsf);
		cstmt.setString(14, dm.pers_ipaddr);
		cstmt.setString(15, dm.pers_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.prnpap.ds.MT_PRNPAP_3414_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("prt_dt = [" + getPrt_dt() + "]");
		System.out.println("hdqt_paper_clsf = [" + getHdqt_paper_clsf() + "]");
		System.out.println("pj_kind = [" + getPj_kind() + "]");
		System.out.println("cnt = [" + getCnt() + "]");
		System.out.println("wgt = [" + getWgt() + "]");
		System.out.println("pre_prt_clsf = [" + getPre_prt_clsf() + "]");
		System.out.println("pers_ipaddr = [" + getPers_ipaddr() + "]");
		System.out.println("pers_id = [" + getPers_id() + "]");
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
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String prt_dt = req.getParameter("prt_dt");
if( prt_dt == null){
	System.out.println(this.toString+" : prt_dt is null" );
}else{
	System.out.println(this.toString+" : prt_dt is "+prt_dt );
}
String hdqt_paper_clsf = req.getParameter("hdqt_paper_clsf");
if( hdqt_paper_clsf == null){
	System.out.println(this.toString+" : hdqt_paper_clsf is null" );
}else{
	System.out.println(this.toString+" : hdqt_paper_clsf is "+hdqt_paper_clsf );
}
String pj_kind = req.getParameter("pj_kind");
if( pj_kind == null){
	System.out.println(this.toString+" : pj_kind is null" );
}else{
	System.out.println(this.toString+" : pj_kind is "+pj_kind );
}
String cnt = req.getParameter("cnt");
if( cnt == null){
	System.out.println(this.toString+" : cnt is null" );
}else{
	System.out.println(this.toString+" : cnt is "+cnt );
}
String wgt = req.getParameter("wgt");
if( wgt == null){
	System.out.println(this.toString+" : wgt is null" );
}else{
	System.out.println(this.toString+" : wgt is "+wgt );
}
String pre_prt_clsf = req.getParameter("pre_prt_clsf");
if( pre_prt_clsf == null){
	System.out.println(this.toString+" : pre_prt_clsf is null" );
}else{
	System.out.println(this.toString+" : pre_prt_clsf is "+pre_prt_clsf );
}
String pers_ipaddr = req.getParameter("pers_ipaddr");
if( pers_ipaddr == null){
	System.out.println(this.toString+" : pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : pers_ipaddr is "+pers_ipaddr );
}
String pers_id = req.getParameter("pers_id");
if( pers_id == null){
	System.out.println(this.toString+" : pers_id is null" );
}else{
	System.out.println(this.toString+" : pers_id is "+pers_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String prt_dt = Util.checkString(req.getParameter("prt_dt"));
String hdqt_paper_clsf = Util.checkString(req.getParameter("hdqt_paper_clsf"));
String pj_kind = Util.checkString(req.getParameter("pj_kind"));
String cnt = Util.checkString(req.getParameter("cnt"));
String wgt = Util.checkString(req.getParameter("wgt"));
String pre_prt_clsf = Util.checkString(req.getParameter("pre_prt_clsf"));
String pers_ipaddr = Util.checkString(req.getParameter("pers_ipaddr"));
String pers_id = Util.checkString(req.getParameter("pers_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String prt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_dt")));
String hdqt_paper_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqt_paper_clsf")));
String pj_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_kind")));
String cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("cnt")));
String wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("wgt")));
String pre_prt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_prt_clsf")));
String pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_ipaddr")));
String pers_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setIssu_dt(issu_dt);
dm.setPrt_dt(prt_dt);
dm.setHdqt_paper_clsf(hdqt_paper_clsf);
dm.setPj_kind(pj_kind);
dm.setCnt(cnt);
dm.setWgt(wgt);
dm.setPre_prt_clsf(pre_prt_clsf);
dm.setPers_ipaddr(pers_ipaddr);
dm.setPers_id(pers_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 13 15:05:46 KST 2009 */