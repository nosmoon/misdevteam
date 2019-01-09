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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_9102_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String start_dt;
	public String ariv_dt;
	public String start_tm;
	public String ariv_tm;
	public String dest;
	public String rid_pers;
	public String rid_deptcd;
	public String driv_purp;
	public String drvr_yn;
	public String remk;
	public String rid_pers_cnt;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;
	
	public MT_ETCCAR_9102_ADM(){}
	public MT_ETCCAR_9102_ADM(String cmpy_cd, String occr_dt, String seq, String start_dt, String ariv_dt, String start_tm, String ariv_tm, String dest, String rid_pers, String rid_deptcd, String driv_purp, String drvr_yn, String remk, String rid_pers_cnt, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.start_dt = start_dt;
		this.ariv_dt = ariv_dt;
		this.start_tm = start_tm;
		this.ariv_tm = ariv_tm;
		this.dest = dest;
		this.rid_pers = rid_pers;
		this.rid_deptcd = rid_deptcd;
		this.driv_purp = driv_purp;
		this.drvr_yn = drvr_yn;
		this.remk = remk;
		this.rid_pers_cnt = rid_pers_cnt;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setStart_dt(String start_dt){
		this.start_dt = start_dt;
	}

	public void setAriv_dt(String ariv_dt){
		this.ariv_dt = ariv_dt;
	}

	public void setStart_tm(String start_tm){
		this.start_tm = start_tm;
	}

	public void setAriv_tm(String ariv_tm){
		this.ariv_tm = ariv_tm;
	}

	public void setDest(String dest){
		this.dest = dest;
	}

	public void setRid_pers(String rid_pers){
		this.rid_pers = rid_pers;
	}

	public void setRid_deptcd(String rid_deptcd){
		this.rid_deptcd = rid_deptcd;
	}

	public void setDriv_purp(String driv_purp){
		this.driv_purp = driv_purp;
	}

	public void setDrvr_yn(String drvr_yn){
		this.drvr_yn = drvr_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setRid_pers_cnt(String rid_pers_cnt){
		this.rid_pers_cnt = rid_pers_cnt;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getStart_dt(){
		return this.start_dt;
	}

	public String getAriv_dt(){
		return this.ariv_dt;
	}

	public String getStart_tm(){
		return this.start_tm;
	}

	public String getAriv_tm(){
		return this.ariv_tm;
	}

	public String getDest(){
		return this.dest;
	}

	public String getRid_pers(){
		return this.rid_pers;
	}

	public String getRid_deptcd(){
		return this.rid_deptcd;
	}

	public String getDriv_purp(){
		return this.driv_purp;
	}

	public String getDrvr_yn(){
		return this.drvr_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getRid_pers_cnt(){
		return this.rid_pers_cnt;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_9102_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_9102_ADM dm = (MT_ETCCAR_9102_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.start_dt);
		cstmt.setString(7, dm.ariv_dt);
		cstmt.setString(8, dm.start_tm);
		cstmt.setString(9, dm.ariv_tm);
		cstmt.setString(10, dm.dest);
		cstmt.setString(11, dm.rid_pers);
		cstmt.setString(12, dm.rid_deptcd);
		cstmt.setString(13, dm.driv_purp);
		cstmt.setString(14, dm.drvr_yn);
		cstmt.setString(15, dm.remk);
		cstmt.setString(16, dm.rid_pers_cnt);
		cstmt.setString(17, dm.incmg_pers_ipaddr);
		cstmt.setString(18, dm.incmg_pers);
		cstmt.setString(19, dm.gubun);
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_9102_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("start_dt = [" + getStart_dt() + "]");
		System.out.println("ariv_dt = [" + getAriv_dt() + "]");
		System.out.println("start_tm = [" + getStart_tm() + "]");
		System.out.println("ariv_tm = [" + getAriv_tm() + "]");
		System.out.println("dest = [" + getDest() + "]");
		System.out.println("rid_pers = [" + getRid_pers() + "]");
		System.out.println("rid_deptcd = [" + getRid_deptcd() + "]");
		System.out.println("driv_purp = [" + getDriv_purp() + "]");
		System.out.println("drvr_yn = [" + getDrvr_yn() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("rid_pers_cnt = [" + getRid_pers_cnt() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String start_dt = req.getParameter("start_dt");
if( start_dt == null){
	System.out.println(this.toString+" : start_dt is null" );
}else{
	System.out.println(this.toString+" : start_dt is "+start_dt );
}
String ariv_dt = req.getParameter("ariv_dt");
if( ariv_dt == null){
	System.out.println(this.toString+" : ariv_dt is null" );
}else{
	System.out.println(this.toString+" : ariv_dt is "+ariv_dt );
}
String start_tm = req.getParameter("start_tm");
if( start_tm == null){
	System.out.println(this.toString+" : start_tm is null" );
}else{
	System.out.println(this.toString+" : start_tm is "+start_tm );
}
String ariv_tm = req.getParameter("ariv_tm");
if( ariv_tm == null){
	System.out.println(this.toString+" : ariv_tm is null" );
}else{
	System.out.println(this.toString+" : ariv_tm is "+ariv_tm );
}
String dest = req.getParameter("dest");
if( dest == null){
	System.out.println(this.toString+" : dest is null" );
}else{
	System.out.println(this.toString+" : dest is "+dest );
}
String rid_pers = req.getParameter("rid_pers");
if( rid_pers == null){
	System.out.println(this.toString+" : rid_pers is null" );
}else{
	System.out.println(this.toString+" : rid_pers is "+rid_pers );
}
String rid_deptcd = req.getParameter("rid_deptcd");
if( rid_deptcd == null){
	System.out.println(this.toString+" : rid_deptcd is null" );
}else{
	System.out.println(this.toString+" : rid_deptcd is "+rid_deptcd );
}
String driv_purp = req.getParameter("driv_purp");
if( driv_purp == null){
	System.out.println(this.toString+" : driv_purp is null" );
}else{
	System.out.println(this.toString+" : driv_purp is "+driv_purp );
}
String req_stat = req.getParameter("req_stat");
if( req_stat == null){
	System.out.println(this.toString+" : req_stat is null" );
}else{
	System.out.println(this.toString+" : req_stat is "+req_stat );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String rid_pers_cnt = req.getParameter("rid_pers_cnt");
if( rid_pers_cnt == null){
	System.out.println(this.toString+" : rid_pers_cnt is null" );
}else{
	System.out.println(this.toString+" : rid_pers_cnt is "+rid_pers_cnt );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String start_dt = Util.checkString(req.getParameter("start_dt"));
String ariv_dt = Util.checkString(req.getParameter("ariv_dt"));
String start_tm = Util.checkString(req.getParameter("start_tm"));
String ariv_tm = Util.checkString(req.getParameter("ariv_tm"));
String dest = Util.checkString(req.getParameter("dest"));
String rid_pers = Util.checkString(req.getParameter("rid_pers"));
String rid_deptcd = Util.checkString(req.getParameter("rid_deptcd"));
String driv_purp = Util.checkString(req.getParameter("driv_purp"));
String req_stat = Util.checkString(req.getParameter("req_stat"));
String remk = Util.checkString(req.getParameter("remk"));
String rid_pers_cnt = Util.checkString(req.getParameter("rid_pers_cnt"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String start_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("start_dt")));
String ariv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ariv_dt")));
String start_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("start_tm")));
String ariv_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("ariv_tm")));
String dest = Util.Uni2Ksc(Util.checkString(req.getParameter("dest")));
String rid_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("rid_pers")));
String rid_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rid_deptcd")));
String driv_purp = Util.Uni2Ksc(Util.checkString(req.getParameter("driv_purp")));
String req_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("req_stat")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String rid_pers_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("rid_pers_cnt")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setStart_dt(start_dt);
dm.setAriv_dt(ariv_dt);
dm.setStart_tm(start_tm);
dm.setAriv_tm(ariv_tm);
dm.setDest(dest);
dm.setRid_pers(rid_pers);
dm.setRid_deptcd(rid_deptcd);
dm.setDriv_purp(driv_purp);
dm.setReq_stat(req_stat);
dm.setRemk(remk);
dm.setRid_pers_cnt(rid_pers_cnt);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 28 19:37:34 KST 2012 */