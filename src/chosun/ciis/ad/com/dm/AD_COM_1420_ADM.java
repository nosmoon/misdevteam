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


package chosun.ciis.ad.com.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_COM_1420_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String srch_dt;
	public String seq;
	public String chrg_pers;
	public String advt_cont;
	public String advt_size;
	public String chro_clsf;
	public String srch_plac;
	public String cntc_plac;
	public String tm;
	public String agn;
	public String sect_clsf;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String flag;

	public AD_COM_1420_ADM(){}
	public AD_COM_1420_ADM(String cmpy_cd, String srch_dt, String seq, String chrg_pers, String advt_cont, String advt_size, String chro_clsf, String srch_plac, String cntc_plac, String tm, String agn, String sect_clsf, String incmg_pers, String incmg_pers_ip, String flag){
		this.cmpy_cd = cmpy_cd;
		this.srch_dt = srch_dt;
		this.seq = seq;
		this.chrg_pers = chrg_pers;
		this.advt_cont = advt_cont;
		this.advt_size = advt_size;
		this.chro_clsf = chro_clsf;
		this.srch_plac = srch_plac;
		this.cntc_plac = cntc_plac;
		this.tm = tm;
		this.agn = agn;
		this.sect_clsf = sect_clsf;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSrch_dt(String srch_dt){
		this.srch_dt = srch_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setAdvt_size(String advt_size){
		this.advt_size = advt_size;
	}

	public void setChro_clsf(String chro_clsf){
		this.chro_clsf = chro_clsf;
	}

	public void setSrch_plac(String srch_plac){
		this.srch_plac = srch_plac;
	}

	public void setCntc_plac(String cntc_plac){
		this.cntc_plac = cntc_plac;
	}

	public void setTm(String tm){
		this.tm = tm;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public void setSect_clsf(String sect_clsf){
		this.sect_clsf = sect_clsf;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSrch_dt(){
		return this.srch_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getAdvt_size(){
		return this.advt_size;
	}

	public String getChro_clsf(){
		return this.chro_clsf;
	}

	public String getSrch_plac(){
		return this.srch_plac;
	}

	public String getCntc_plac(){
		return this.cntc_plac;
	}

	public String getTm(){
		return this.tm;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getSect_clsf(){
		return this.sect_clsf;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_COM_1420_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_COM_1420_ADM dm = (AD_COM_1420_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.srch_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.chrg_pers);
		cstmt.setString(7, dm.advt_cont);
		cstmt.setString(8, dm.advt_size);
		cstmt.setString(9, dm.chro_clsf);
		cstmt.setString(10, dm.srch_plac);
		cstmt.setString(11, dm.cntc_plac);
		cstmt.setString(12, dm.tm);
		cstmt.setString(13, dm.agn);
		cstmt.setString(14, dm.sect_clsf);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.setString(16, dm.incmg_pers_ip);
		cstmt.setString(17, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.com.ds.AD_COM_1420_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("srch_dt = [" + getSrch_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("advt_cont = [" + getAdvt_cont() + "]");
		System.out.println("advt_size = [" + getAdvt_size() + "]");
		System.out.println("chro_clsf = [" + getChro_clsf() + "]");
		System.out.println("srch_plac = [" + getSrch_plac() + "]");
		System.out.println("cntc_plac = [" + getCntc_plac() + "]");
		System.out.println("tm = [" + getTm() + "]");
		System.out.println("agn = [" + getAgn() + "]");
		System.out.println("sect_clsf = [" + getSect_clsf() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("flag = [" + getFlag() + "]");
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
String srch_dt = req.getParameter("srch_dt");
if( srch_dt == null){
	System.out.println(this.toString+" : srch_dt is null" );
}else{
	System.out.println(this.toString+" : srch_dt is "+srch_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
}
String advt_size = req.getParameter("advt_size");
if( advt_size == null){
	System.out.println(this.toString+" : advt_size is null" );
}else{
	System.out.println(this.toString+" : advt_size is "+advt_size );
}
String chro_clsf = req.getParameter("chro_clsf");
if( chro_clsf == null){
	System.out.println(this.toString+" : chro_clsf is null" );
}else{
	System.out.println(this.toString+" : chro_clsf is "+chro_clsf );
}
String srch_plac = req.getParameter("srch_plac");
if( srch_plac == null){
	System.out.println(this.toString+" : srch_plac is null" );
}else{
	System.out.println(this.toString+" : srch_plac is "+srch_plac );
}
String cntc_plac = req.getParameter("cntc_plac");
if( cntc_plac == null){
	System.out.println(this.toString+" : cntc_plac is null" );
}else{
	System.out.println(this.toString+" : cntc_plac is "+cntc_plac );
}
String tm = req.getParameter("tm");
if( tm == null){
	System.out.println(this.toString+" : tm is null" );
}else{
	System.out.println(this.toString+" : tm is "+tm );
}
String agn = req.getParameter("agn");
if( agn == null){
	System.out.println(this.toString+" : agn is null" );
}else{
	System.out.println(this.toString+" : agn is "+agn );
}
String sect_clsf = req.getParameter("sect_clsf");
if( sect_clsf == null){
	System.out.println(this.toString+" : sect_clsf is null" );
}else{
	System.out.println(this.toString+" : sect_clsf is "+sect_clsf );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String srch_dt = Util.checkString(req.getParameter("srch_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String advt_size = Util.checkString(req.getParameter("advt_size"));
String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
String srch_plac = Util.checkString(req.getParameter("srch_plac"));
String cntc_plac = Util.checkString(req.getParameter("cntc_plac"));
String tm = Util.checkString(req.getParameter("tm"));
String agn = Util.checkString(req.getParameter("agn"));
String sect_clsf = Util.checkString(req.getParameter("sect_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String srch_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String advt_size = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_size")));
String chro_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf")));
String srch_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_plac")));
String cntc_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("cntc_plac")));
String tm = Util.Uni2Ksc(Util.checkString(req.getParameter("tm")));
String agn = Util.Uni2Ksc(Util.checkString(req.getParameter("agn")));
String sect_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSrch_dt(srch_dt);
dm.setSeq(seq);
dm.setChrg_pers(chrg_pers);
dm.setAdvt_cont(advt_cont);
dm.setAdvt_size(advt_size);
dm.setChro_clsf(chro_clsf);
dm.setSrch_plac(srch_plac);
dm.setCntc_plac(cntc_plac);
dm.setTm(tm);
dm.setAgn(agn);
dm.setSect_clsf(sect_clsf);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 19 20:37:27 KST 2009 */