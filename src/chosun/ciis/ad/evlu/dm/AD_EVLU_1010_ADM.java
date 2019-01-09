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


package chosun.ciis.ad.evlu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.evlu.ds.*;
import chosun.ciis.ad.evlu.rec.*;

/**
 * 
 */


public class AD_EVLU_1010_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String search_ymd;
	public String acct_id;
	public String team_cd;
	public String posi_cd;
	public String paper_scor;
	public String paper_remk;
	public String pubsh_scor;
	public String pubsh_remk;
	public String pric_scor;
	public String pric_remk;
	public String spcl_scor;
	public String spcl_remk;
	public String adj_evlu_scor;
	public String adj_evlu_remk;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_EVLU_1010_ADM(){}
	public AD_EVLU_1010_ADM(String mode, String cmpy_cd, String search_ymd, String acct_id, String team_cd, String posi_cd, String paper_scor, String paper_remk, String pubsh_scor, String pubsh_remk, String pric_scor, String pric_remk, String spcl_scor, String spcl_remk, String adj_evlu_scor, String adj_evlu_remk, String incmg_pers_ip, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.search_ymd = search_ymd;
		this.acct_id = acct_id;
		this.team_cd = team_cd;
		this.posi_cd = posi_cd;
		this.paper_scor = paper_scor;
		this.paper_remk = paper_remk;
		this.pubsh_scor = pubsh_scor;
		this.pubsh_remk = pubsh_remk;
		this.pric_scor = pric_scor;
		this.pric_remk = pric_remk;
		this.spcl_scor = spcl_scor;
		this.spcl_remk = spcl_remk;
		this.adj_evlu_scor = adj_evlu_scor;
		this.adj_evlu_remk = adj_evlu_remk;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_ymd(String search_ymd){
		this.search_ymd = search_ymd;
	}

	public void setAcct_id(String acct_id){
		this.acct_id = acct_id;
	}

	public void setTeam_cd(String team_cd){
		this.team_cd = team_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPaper_scor(String paper_scor){
		this.paper_scor = paper_scor;
	}

	public void setPaper_remk(String paper_remk){
		this.paper_remk = paper_remk;
	}

	public void setPubsh_scor(String pubsh_scor){
		this.pubsh_scor = pubsh_scor;
	}

	public void setPubsh_remk(String pubsh_remk){
		this.pubsh_remk = pubsh_remk;
	}

	public void setPric_scor(String pric_scor){
		this.pric_scor = pric_scor;
	}

	public void setPric_remk(String pric_remk){
		this.pric_remk = pric_remk;
	}

	public void setSpcl_scor(String spcl_scor){
		this.spcl_scor = spcl_scor;
	}

	public void setSpcl_remk(String spcl_remk){
		this.spcl_remk = spcl_remk;
	}

	public void setAdj_evlu_scor(String adj_evlu_scor){
		this.adj_evlu_scor = adj_evlu_scor;
	}

	public void setAdj_evlu_remk(String adj_evlu_remk){
		this.adj_evlu_remk = adj_evlu_remk;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_ymd(){
		return this.search_ymd;
	}

	public String getAcct_id(){
		return this.acct_id;
	}

	public String getTeam_cd(){
		return this.team_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPaper_scor(){
		return this.paper_scor;
	}

	public String getPaper_remk(){
		return this.paper_remk;
	}

	public String getPubsh_scor(){
		return this.pubsh_scor;
	}

	public String getPubsh_remk(){
		return this.pubsh_remk;
	}

	public String getPric_scor(){
		return this.pric_scor;
	}

	public String getPric_remk(){
		return this.pric_remk;
	}

	public String getSpcl_scor(){
		return this.spcl_scor;
	}

	public String getSpcl_remk(){
		return this.spcl_remk;
	}

	public String getAdj_evlu_scor(){
		return this.adj_evlu_scor;
	}

	public String getAdj_evlu_remk(){
		return this.adj_evlu_remk;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_EVLU_1010_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_EVLU_1010_ADM dm = (AD_EVLU_1010_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.search_ymd);
		cstmt.setString(6, dm.acct_id);
		cstmt.setString(7, dm.team_cd);
		cstmt.setString(8, dm.posi_cd);
		cstmt.setString(9, dm.paper_scor);
		cstmt.setString(10, dm.paper_remk);
		cstmt.setString(11, dm.pubsh_scor);
		cstmt.setString(12, dm.pubsh_remk);
		cstmt.setString(13, dm.pric_scor);
		cstmt.setString(14, dm.pric_remk);
		cstmt.setString(15, dm.spcl_scor);
		cstmt.setString(16, dm.spcl_remk);
		cstmt.setString(17, dm.adj_evlu_scor);
		cstmt.setString(18, dm.adj_evlu_remk);
		cstmt.setString(19, dm.incmg_pers_ip);
		cstmt.setString(20, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new AD_EVLU_1010_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("search_ymd = [" + getSearch_ymd() + "]");
		System.out.println("acct_id = [" + getAcct_id() + "]");
		System.out.println("team_cd = [" + getTeam_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("paper_scor = [" + getPaper_scor() + "]");
		System.out.println("paper_remk = [" + getPaper_remk() + "]");
		System.out.println("pubsh_scor = [" + getPubsh_scor() + "]");
		System.out.println("pubsh_remk = [" + getPubsh_remk() + "]");
		System.out.println("pric_scor = [" + getPric_scor() + "]");
		System.out.println("pric_remk = [" + getPric_remk() + "]");
		System.out.println("spcl_scor = [" + getSpcl_scor() + "]");
		System.out.println("spcl_remk = [" + getSpcl_remk() + "]");
		System.out.println("adj_evlu_scor = [" + getAdj_evlu_scor() + "]");
		System.out.println("adj_evlu_remk = [" + getAdj_evlu_remk() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String search_ymd = req.getParameter("search_ymd");
if( search_ymd == null){
	System.out.println(this.toString+" : search_ymd is null" );
}else{
	System.out.println(this.toString+" : search_ymd is "+search_ymd );
}
String acct_id = req.getParameter("acct_id");
if( acct_id == null){
	System.out.println(this.toString+" : acct_id is null" );
}else{
	System.out.println(this.toString+" : acct_id is "+acct_id );
}
String team_cd = req.getParameter("team_cd");
if( team_cd == null){
	System.out.println(this.toString+" : team_cd is null" );
}else{
	System.out.println(this.toString+" : team_cd is "+team_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String paper_scor = req.getParameter("paper_scor");
if( paper_scor == null){
	System.out.println(this.toString+" : paper_scor is null" );
}else{
	System.out.println(this.toString+" : paper_scor is "+paper_scor );
}
String paper_remk = req.getParameter("paper_remk");
if( paper_remk == null){
	System.out.println(this.toString+" : paper_remk is null" );
}else{
	System.out.println(this.toString+" : paper_remk is "+paper_remk );
}
String pubsh_scor = req.getParameter("pubsh_scor");
if( pubsh_scor == null){
	System.out.println(this.toString+" : pubsh_scor is null" );
}else{
	System.out.println(this.toString+" : pubsh_scor is "+pubsh_scor );
}
String pubsh_remk = req.getParameter("pubsh_remk");
if( pubsh_remk == null){
	System.out.println(this.toString+" : pubsh_remk is null" );
}else{
	System.out.println(this.toString+" : pubsh_remk is "+pubsh_remk );
}
String pric_scor = req.getParameter("pric_scor");
if( pric_scor == null){
	System.out.println(this.toString+" : pric_scor is null" );
}else{
	System.out.println(this.toString+" : pric_scor is "+pric_scor );
}
String pric_remk = req.getParameter("pric_remk");
if( pric_remk == null){
	System.out.println(this.toString+" : pric_remk is null" );
}else{
	System.out.println(this.toString+" : pric_remk is "+pric_remk );
}
String spcl_scor = req.getParameter("spcl_scor");
if( spcl_scor == null){
	System.out.println(this.toString+" : spcl_scor is null" );
}else{
	System.out.println(this.toString+" : spcl_scor is "+spcl_scor );
}
String spcl_remk = req.getParameter("spcl_remk");
if( spcl_remk == null){
	System.out.println(this.toString+" : spcl_remk is null" );
}else{
	System.out.println(this.toString+" : spcl_remk is "+spcl_remk );
}
String adj_evlu_scor = req.getParameter("adj_evlu_scor");
if( adj_evlu_scor == null){
	System.out.println(this.toString+" : adj_evlu_scor is null" );
}else{
	System.out.println(this.toString+" : adj_evlu_scor is "+adj_evlu_scor );
}
String adj_evlu_remk = req.getParameter("adj_evlu_remk");
if( adj_evlu_remk == null){
	System.out.println(this.toString+" : adj_evlu_remk is null" );
}else{
	System.out.println(this.toString+" : adj_evlu_remk is "+adj_evlu_remk );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_ymd = Util.checkString(req.getParameter("search_ymd"));
String acct_id = Util.checkString(req.getParameter("acct_id"));
String team_cd = Util.checkString(req.getParameter("team_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String paper_scor = Util.checkString(req.getParameter("paper_scor"));
String paper_remk = Util.checkString(req.getParameter("paper_remk"));
String pubsh_scor = Util.checkString(req.getParameter("pubsh_scor"));
String pubsh_remk = Util.checkString(req.getParameter("pubsh_remk"));
String pric_scor = Util.checkString(req.getParameter("pric_scor"));
String pric_remk = Util.checkString(req.getParameter("pric_remk"));
String spcl_scor = Util.checkString(req.getParameter("spcl_scor"));
String spcl_remk = Util.checkString(req.getParameter("spcl_remk"));
String adj_evlu_scor = Util.checkString(req.getParameter("adj_evlu_scor"));
String adj_evlu_remk = Util.checkString(req.getParameter("adj_evlu_remk"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_ymd = Util.Uni2Ksc(Util.checkString(req.getParameter("search_ymd")));
String acct_id = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_id")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String paper_scor = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_scor")));
String paper_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_remk")));
String pubsh_scor = Util.Uni2Ksc(Util.checkString(req.getParameter("pubsh_scor")));
String pubsh_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("pubsh_remk")));
String pric_scor = Util.Uni2Ksc(Util.checkString(req.getParameter("pric_scor")));
String pric_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("pric_remk")));
String spcl_scor = Util.Uni2Ksc(Util.checkString(req.getParameter("spcl_scor")));
String spcl_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("spcl_remk")));
String adj_evlu_scor = Util.Uni2Ksc(Util.checkString(req.getParameter("adj_evlu_scor")));
String adj_evlu_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("adj_evlu_remk")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setSearch_ymd(search_ymd);
dm.setAcct_id(acct_id);
dm.setTeam_cd(team_cd);
dm.setPosi_cd(posi_cd);
dm.setPaper_scor(paper_scor);
dm.setPaper_remk(paper_remk);
dm.setPubsh_scor(pubsh_scor);
dm.setPubsh_remk(pubsh_remk);
dm.setPric_scor(pric_scor);
dm.setPric_remk(pric_remk);
dm.setSpcl_scor(spcl_scor);
dm.setSpcl_remk(spcl_remk);
dm.setAdj_evlu_scor(adj_evlu_scor);
dm.setAdj_evlu_remk(adj_evlu_remk);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 15 17:19:37 KST 2010 */