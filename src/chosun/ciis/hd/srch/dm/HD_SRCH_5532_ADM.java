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


package chosun.ciis.hd.srch.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.ds.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_5532_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_dt;
	public String head_clsf_00_01;
	public String head_clsf_01_01;
	public String head_clsf_01_02;
	public String gridtitle;
	public String posk_gbn;
	public String m_cnt;
	public String m_avg_saly;
	public String m_sum_saly;
	public String w_cnt;
	public String w_avg_saly;
	public String w_sum_saly;
	public String tot_cnt;
	public String tot_avg_saly;
	public String tot_sum_saly;
	public String mode;
	public String text_tag;
	public String incmg_pers;
	public String chg_pers;

	public HD_SRCH_5532_ADM(){}
	public HD_SRCH_5532_ADM(String cmpy_cd, String basi_dt, String head_clsf_00_01, String head_clsf_01_01, String head_clsf_01_02, String gridtitle, String posk_gbn, String m_cnt, String m_avg_saly, String m_sum_saly, String w_cnt, String w_avg_saly, String w_sum_saly, String tot_cnt, String tot_avg_saly, String tot_sum_saly, String mode, String text_tag, String incmg_pers, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.basi_dt = basi_dt;
		this.head_clsf_00_01 = head_clsf_00_01;
		this.head_clsf_01_01 = head_clsf_01_01;
		this.head_clsf_01_02 = head_clsf_01_02;
		this.gridtitle = gridtitle;
		this.posk_gbn = posk_gbn;
		this.m_cnt = m_cnt;
		this.m_avg_saly = m_avg_saly;
		this.m_sum_saly = m_sum_saly;
		this.w_cnt = w_cnt;
		this.w_avg_saly = w_avg_saly;
		this.w_sum_saly = w_sum_saly;
		this.tot_cnt = tot_cnt;
		this.tot_avg_saly = tot_avg_saly;
		this.tot_sum_saly = tot_sum_saly;
		this.mode = mode;
		this.text_tag = text_tag;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setHead_clsf_00_01(String head_clsf_00_01){
		this.head_clsf_00_01 = head_clsf_00_01;
	}

	public void setHead_clsf_01_01(String head_clsf_01_01){
		this.head_clsf_01_01 = head_clsf_01_01;
	}

	public void setHead_clsf_01_02(String head_clsf_01_02){
		this.head_clsf_01_02 = head_clsf_01_02;
	}

	public void setGridtitle(String gridtitle){
		this.gridtitle = gridtitle;
	}

	public void setPosk_gbn(String posk_gbn){
		this.posk_gbn = posk_gbn;
	}

	public void setM_cnt(String m_cnt){
		this.m_cnt = m_cnt;
	}

	public void setM_avg_saly(String m_avg_saly){
		this.m_avg_saly = m_avg_saly;
	}

	public void setM_sum_saly(String m_sum_saly){
		this.m_sum_saly = m_sum_saly;
	}

	public void setW_cnt(String w_cnt){
		this.w_cnt = w_cnt;
	}

	public void setW_avg_saly(String w_avg_saly){
		this.w_avg_saly = w_avg_saly;
	}

	public void setW_sum_saly(String w_sum_saly){
		this.w_sum_saly = w_sum_saly;
	}

	public void setTot_cnt(String tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public void setTot_avg_saly(String tot_avg_saly){
		this.tot_avg_saly = tot_avg_saly;
	}

	public void setTot_sum_saly(String tot_sum_saly){
		this.tot_sum_saly = tot_sum_saly;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setText_tag(String text_tag){
		this.text_tag = text_tag;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getHead_clsf_00_01(){
		return this.head_clsf_00_01;
	}

	public String getHead_clsf_01_01(){
		return this.head_clsf_01_01;
	}

	public String getHead_clsf_01_02(){
		return this.head_clsf_01_02;
	}

	public String getGridtitle(){
		return this.gridtitle;
	}

	public String getPosk_gbn(){
		return this.posk_gbn;
	}

	public String getM_cnt(){
		return this.m_cnt;
	}

	public String getM_avg_saly(){
		return this.m_avg_saly;
	}

	public String getM_sum_saly(){
		return this.m_sum_saly;
	}

	public String getW_cnt(){
		return this.w_cnt;
	}

	public String getW_avg_saly(){
		return this.w_avg_saly;
	}

	public String getW_sum_saly(){
		return this.w_sum_saly;
	}

	public String getTot_cnt(){
		return this.tot_cnt;
	}

	public String getTot_avg_saly(){
		return this.tot_avg_saly;
	}

	public String getTot_sum_saly(){
		return this.tot_sum_saly;
	}

	public String getMode(){
		return this.mode;
	}

	public String getText_tag(){
		return this.text_tag;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SRCH_5532_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_5532_ADM dm = (HD_SRCH_5532_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.basi_dt);
		cstmt.setString(6, dm.head_clsf_00_01);
		cstmt.setString(7, dm.head_clsf_01_01);
		cstmt.setString(8, dm.head_clsf_01_02);
		cstmt.setString(9, dm.gridtitle);
		cstmt.setString(10, dm.posk_gbn);
		cstmt.setString(11, dm.m_cnt);
		cstmt.setString(12, dm.m_avg_saly);
		cstmt.setString(13, dm.m_sum_saly);
		cstmt.setString(14, dm.w_cnt);
		cstmt.setString(15, dm.w_avg_saly);
		cstmt.setString(16, dm.w_sum_saly);
		cstmt.setString(17, dm.tot_cnt);
		cstmt.setString(18, dm.tot_avg_saly);
		cstmt.setString(19, dm.tot_sum_saly);
		cstmt.setString(20, dm.mode);
		cstmt.setString(21, dm.text_tag);
		cstmt.setString(22, dm.incmg_pers);
		cstmt.setString(23, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_5532_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("head_clsf_00_01 = [" + getHead_clsf_00_01() + "]");
		System.out.println("head_clsf_01_01 = [" + getHead_clsf_01_01() + "]");
		System.out.println("head_clsf_01_02 = [" + getHead_clsf_01_02() + "]");
		System.out.println("gridtitle = [" + getGridtitle() + "]");
		System.out.println("posk_gbn = [" + getPosk_gbn() + "]");
		System.out.println("m_cnt = [" + getM_cnt() + "]");
		System.out.println("m_avg_saly = [" + getM_avg_saly() + "]");
		System.out.println("m_sum_saly = [" + getM_sum_saly() + "]");
		System.out.println("w_cnt = [" + getW_cnt() + "]");
		System.out.println("w_avg_saly = [" + getW_avg_saly() + "]");
		System.out.println("w_sum_saly = [" + getW_sum_saly() + "]");
		System.out.println("tot_cnt = [" + getTot_cnt() + "]");
		System.out.println("tot_avg_saly = [" + getTot_avg_saly() + "]");
		System.out.println("tot_sum_saly = [" + getTot_sum_saly() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("text_tag = [" + getText_tag() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
}
String head_clsf_00_01 = req.getParameter("head_clsf_00_01");
if( head_clsf_00_01 == null){
	System.out.println(this.toString+" : head_clsf_00_01 is null" );
}else{
	System.out.println(this.toString+" : head_clsf_00_01 is "+head_clsf_00_01 );
}
String head_clsf_01_01 = req.getParameter("head_clsf_01_01");
if( head_clsf_01_01 == null){
	System.out.println(this.toString+" : head_clsf_01_01 is null" );
}else{
	System.out.println(this.toString+" : head_clsf_01_01 is "+head_clsf_01_01 );
}
String head_clsf_01_02 = req.getParameter("head_clsf_01_02");
if( head_clsf_01_02 == null){
	System.out.println(this.toString+" : head_clsf_01_02 is null" );
}else{
	System.out.println(this.toString+" : head_clsf_01_02 is "+head_clsf_01_02 );
}
String gridtitle = req.getParameter("gridtitle");
if( gridtitle == null){
	System.out.println(this.toString+" : gridtitle is null" );
}else{
	System.out.println(this.toString+" : gridtitle is "+gridtitle );
}
String posk_gbn = req.getParameter("posk_gbn");
if( posk_gbn == null){
	System.out.println(this.toString+" : posk_gbn is null" );
}else{
	System.out.println(this.toString+" : posk_gbn is "+posk_gbn );
}
String m_cnt = req.getParameter("m_cnt");
if( m_cnt == null){
	System.out.println(this.toString+" : m_cnt is null" );
}else{
	System.out.println(this.toString+" : m_cnt is "+m_cnt );
}
String m_avg_saly = req.getParameter("m_avg_saly");
if( m_avg_saly == null){
	System.out.println(this.toString+" : m_avg_saly is null" );
}else{
	System.out.println(this.toString+" : m_avg_saly is "+m_avg_saly );
}
String m_sum_saly = req.getParameter("m_sum_saly");
if( m_sum_saly == null){
	System.out.println(this.toString+" : m_sum_saly is null" );
}else{
	System.out.println(this.toString+" : m_sum_saly is "+m_sum_saly );
}
String w_cnt = req.getParameter("w_cnt");
if( w_cnt == null){
	System.out.println(this.toString+" : w_cnt is null" );
}else{
	System.out.println(this.toString+" : w_cnt is "+w_cnt );
}
String w_avg_saly = req.getParameter("w_avg_saly");
if( w_avg_saly == null){
	System.out.println(this.toString+" : w_avg_saly is null" );
}else{
	System.out.println(this.toString+" : w_avg_saly is "+w_avg_saly );
}
String w_sum_saly = req.getParameter("w_sum_saly");
if( w_sum_saly == null){
	System.out.println(this.toString+" : w_sum_saly is null" );
}else{
	System.out.println(this.toString+" : w_sum_saly is "+w_sum_saly );
}
String tot_cnt = req.getParameter("tot_cnt");
if( tot_cnt == null){
	System.out.println(this.toString+" : tot_cnt is null" );
}else{
	System.out.println(this.toString+" : tot_cnt is "+tot_cnt );
}
String tot_avg_saly = req.getParameter("tot_avg_saly");
if( tot_avg_saly == null){
	System.out.println(this.toString+" : tot_avg_saly is null" );
}else{
	System.out.println(this.toString+" : tot_avg_saly is "+tot_avg_saly );
}
String tot_sum_saly = req.getParameter("tot_sum_saly");
if( tot_sum_saly == null){
	System.out.println(this.toString+" : tot_sum_saly is null" );
}else{
	System.out.println(this.toString+" : tot_sum_saly is "+tot_sum_saly );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String text_tag = req.getParameter("text_tag");
if( text_tag == null){
	System.out.println(this.toString+" : text_tag is null" );
}else{
	System.out.println(this.toString+" : text_tag is "+text_tag );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
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
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01"));
String head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01"));
String head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02"));
String gridtitle = Util.checkString(req.getParameter("gridtitle"));
String posk_gbn = Util.checkString(req.getParameter("posk_gbn"));
String m_cnt = Util.checkString(req.getParameter("m_cnt"));
String m_avg_saly = Util.checkString(req.getParameter("m_avg_saly"));
String m_sum_saly = Util.checkString(req.getParameter("m_sum_saly"));
String w_cnt = Util.checkString(req.getParameter("w_cnt"));
String w_avg_saly = Util.checkString(req.getParameter("w_avg_saly"));
String w_sum_saly = Util.checkString(req.getParameter("w_sum_saly"));
String tot_cnt = Util.checkString(req.getParameter("tot_cnt"));
String tot_avg_saly = Util.checkString(req.getParameter("tot_avg_saly"));
String tot_sum_saly = Util.checkString(req.getParameter("tot_sum_saly"));
String mode = Util.checkString(req.getParameter("mode"));
String text_tag = Util.checkString(req.getParameter("text_tag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String head_clsf_00_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_00_01")));
String head_clsf_01_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_01_01")));
String head_clsf_01_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_01_02")));
String gridtitle = Util.Uni2Ksc(Util.checkString(req.getParameter("gridtitle")));
String posk_gbn = Util.Uni2Ksc(Util.checkString(req.getParameter("posk_gbn")));
String m_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("m_cnt")));
String m_avg_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("m_avg_saly")));
String m_sum_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("m_sum_saly")));
String w_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("w_cnt")));
String w_avg_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("w_avg_saly")));
String w_sum_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("w_sum_saly")));
String tot_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_cnt")));
String tot_avg_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_avg_saly")));
String tot_sum_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_sum_saly")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String text_tag = Util.Uni2Ksc(Util.checkString(req.getParameter("text_tag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBasi_dt(basi_dt);
dm.setHead_clsf_00_01(head_clsf_00_01);
dm.setHead_clsf_01_01(head_clsf_01_01);
dm.setHead_clsf_01_02(head_clsf_01_02);
dm.setGridtitle(gridtitle);
dm.setPosk_gbn(posk_gbn);
dm.setM_cnt(m_cnt);
dm.setM_avg_saly(m_avg_saly);
dm.setM_sum_saly(m_sum_saly);
dm.setW_cnt(w_cnt);
dm.setW_avg_saly(w_avg_saly);
dm.setW_sum_saly(w_sum_saly);
dm.setTot_cnt(tot_cnt);
dm.setTot_avg_saly(tot_avg_saly);
dm.setTot_sum_saly(tot_sum_saly);
dm.setMode(mode);
dm.setText_tag(text_tag);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 19 14:50:50 KST 2018 */