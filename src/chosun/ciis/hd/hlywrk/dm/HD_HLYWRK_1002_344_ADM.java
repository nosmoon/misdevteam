/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.hlywrk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.hlywrk.ds.*;
import chosun.ciis.hd.hlywrk.rec.*;

/**
 * 
 */


public class HD_HLYWRK_1002_344_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
//	public String occr_dt;
	public String new_aply_basi_dt;
	public String aply_basi_dt;
	public String seq;
	public String hody_clsf;
	public String obj_clsf;
	public String prsnt_hody_clsf;
	public String finish_hody_clsf;
	public String prsnt_tm;
	public String finish_tm;
	public String finish_dd_clsf;
	public String duty_tm;
	public String base_alon;
	public String cmpn_alon;
	public String alvc_occr_yn;
	public String u_ipadd;
	public String u_id;

	public HD_HLYWRK_1002_344_ADM(){}
	public HD_HLYWRK_1002_344_ADM(String mode, String cmpy_cd, String occr_dt, String new_aply_basi_dt, String aply_basi_dt, String seq, String hody_clsf, String obj_clsf, String prsnt_hody_clsf, String finish_hody_clsf, String prsnt_tm, String finish_tm, String finish_dd_clsf, String duty_tm, String base_alon, String cmpn_alon, String alvc_occr_yn, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
//		this.occr_dt = occr_dt;
		this.new_aply_basi_dt = new_aply_basi_dt;
		this.aply_basi_dt = aply_basi_dt;
		this.seq = seq;
		this.hody_clsf = hody_clsf;
		this.obj_clsf = obj_clsf;
		this.prsnt_hody_clsf = prsnt_hody_clsf;
		this.finish_hody_clsf = finish_hody_clsf;
		this.prsnt_tm = prsnt_tm;
		this.finish_tm = finish_tm;
		this.finish_dd_clsf = finish_dd_clsf;
		this.duty_tm = duty_tm;
		this.base_alon = base_alon;
		this.cmpn_alon = cmpn_alon;
		this.alvc_occr_yn = alvc_occr_yn;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

//	public void setOccr_dt(String occr_dt){
//		this.occr_dt = occr_dt;
//	}

	public void setNew_aply_basi_dt(String new_aply_basi_dt){
		this.new_aply_basi_dt = new_aply_basi_dt;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setHody_clsf(String hody_clsf){
		this.hody_clsf = hody_clsf;
	}

	public void setObj_clsf(String obj_clsf){
		this.obj_clsf = obj_clsf;
	}

	public void setPrsnt_hody_clsf(String prsnt_hody_clsf){
		this.prsnt_hody_clsf = prsnt_hody_clsf;
	}

	public void setFinish_hody_clsf(String finish_hody_clsf){
		this.finish_hody_clsf = finish_hody_clsf;
	}

	public void setPrsnt_tm(String prsnt_tm){
		this.prsnt_tm = prsnt_tm;
	}

	public void setFinish_tm(String finish_tm){
		this.finish_tm = finish_tm;
	}

	public void setFinish_dd_clsf(String finish_dd_clsf){
		this.finish_dd_clsf = finish_dd_clsf;
	}

	public void setDuty_tm(String duty_tm){
		this.duty_tm = duty_tm;
	}

	public void setBase_alon(String base_alon){
		this.base_alon = base_alon;
	}

	public void setCmpn_alon(String cmpn_alon){
		this.cmpn_alon = cmpn_alon;
	}

	public void setAlvc_occr_yn(String alvc_occr_yn){
		this.alvc_occr_yn = alvc_occr_yn;
	}

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

//	public String getOccr_dt(){
//		return this.occr_dt;
//	}

	public String getNew_aply_basi_dt(){
		return this.new_aply_basi_dt;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getHody_clsf(){
		return this.hody_clsf;
	}

	public String getObj_clsf(){
		return this.obj_clsf;
	}

	public String getPrsnt_hody_clsf(){
		return this.prsnt_hody_clsf;
	}

	public String getFinish_hody_clsf(){
		return this.finish_hody_clsf;
	}

	public String getPrsnt_tm(){
		return this.prsnt_tm;
	}

	public String getFinish_tm(){
		return this.finish_tm;
	}

	public String getFinish_dd_clsf(){
		return this.finish_dd_clsf;
	}

	public String getDuty_tm(){
		return this.duty_tm;
	}

	public String getBase_alon(){
		return this.base_alon;
	}

	public String getCmpn_alon(){
		return this.cmpn_alon;
	}

	public String getAlvc_occr_yn(){
		return this.alvc_occr_yn;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_HLYWRK_1002_344_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_HLYWRK_1002_344_ADM dm = (HD_HLYWRK_1002_344_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
//		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(5, dm.new_aply_basi_dt);
		cstmt.setString(6, dm.aply_basi_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.hody_clsf);
		cstmt.setString(9, dm.obj_clsf);
		cstmt.setString(10, dm.prsnt_hody_clsf);
		cstmt.setString(11, dm.finish_hody_clsf);
		cstmt.setString(12, dm.prsnt_tm);
		cstmt.setString(13, dm.finish_tm);
		cstmt.setString(14, dm.finish_dd_clsf);
		cstmt.setString(15, dm.duty_tm);
		cstmt.setString(16, dm.base_alon);
		cstmt.setString(17, dm.cmpn_alon);
		cstmt.setString(18, dm.alvc_occr_yn);
		cstmt.setString(19, dm.u_ipadd);
		cstmt.setString(20, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.hlywrk.ds.HD_HLYWRK_1002_344_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
//		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("new_aply_basi_dt = [" + getNew_aply_basi_dt() + "]");
		System.out.println("aply_basi_dt = [" + getAply_basi_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("hody_clsf = [" + getHody_clsf() + "]");
		System.out.println("obj_clsf = [" + getObj_clsf() + "]");
		System.out.println("prsnt_hody_clsf = [" + getPrsnt_hody_clsf() + "]");
		System.out.println("finish_hody_clsf = [" + getFinish_hody_clsf() + "]");
		System.out.println("prsnt_tm = [" + getPrsnt_tm() + "]");
		System.out.println("finish_tm = [" + getFinish_tm() + "]");
		System.out.println("finish_dd_clsf = [" + getFinish_dd_clsf() + "]");
		System.out.println("duty_tm = [" + getDuty_tm() + "]");
		System.out.println("base_alon = [" + getBase_alon() + "]");
		System.out.println("cmpn_alon = [" + getCmpn_alon() + "]");
		System.out.println("alvc_occr_yn = [" + getAlvc_occr_yn() + "]");
		System.out.println("u_ipadd = [" + getU_ipadd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String new_aply_basi_dt = req.getParameter("new_aply_basi_dt");
if( new_aply_basi_dt == null){
	System.out.println(this.toString+" : new_aply_basi_dt is null" );
}else{
	System.out.println(this.toString+" : new_aply_basi_dt is "+new_aply_basi_dt );
}
String aply_basi_dt = req.getParameter("aply_basi_dt");
if( aply_basi_dt == null){
	System.out.println(this.toString+" : aply_basi_dt is null" );
}else{
	System.out.println(this.toString+" : aply_basi_dt is "+aply_basi_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String hody_clsf = req.getParameter("hody_clsf");
if( hody_clsf == null){
	System.out.println(this.toString+" : hody_clsf is null" );
}else{
	System.out.println(this.toString+" : hody_clsf is "+hody_clsf );
}
String obj_clsf = req.getParameter("obj_clsf");
if( obj_clsf == null){
	System.out.println(this.toString+" : obj_clsf is null" );
}else{
	System.out.println(this.toString+" : obj_clsf is "+obj_clsf );
}
String prsnt_hody_clsf = req.getParameter("prsnt_hody_clsf");
if( prsnt_hody_clsf == null){
	System.out.println(this.toString+" : prsnt_hody_clsf is null" );
}else{
	System.out.println(this.toString+" : prsnt_hody_clsf is "+prsnt_hody_clsf );
}
String finish_hody_clsf = req.getParameter("finish_hody_clsf");
if( finish_hody_clsf == null){
	System.out.println(this.toString+" : finish_hody_clsf is null" );
}else{
	System.out.println(this.toString+" : finish_hody_clsf is "+finish_hody_clsf );
}
String prsnt_tm = req.getParameter("prsnt_tm");
if( prsnt_tm == null){
	System.out.println(this.toString+" : prsnt_tm is null" );
}else{
	System.out.println(this.toString+" : prsnt_tm is "+prsnt_tm );
}
String finish_tm = req.getParameter("finish_tm");
if( finish_tm == null){
	System.out.println(this.toString+" : finish_tm is null" );
}else{
	System.out.println(this.toString+" : finish_tm is "+finish_tm );
}
String finish_dd_clsf = req.getParameter("finish_dd_clsf");
if( finish_dd_clsf == null){
	System.out.println(this.toString+" : finish_dd_clsf is null" );
}else{
	System.out.println(this.toString+" : finish_dd_clsf is "+finish_dd_clsf );
}
String duty_tm = req.getParameter("duty_tm");
if( duty_tm == null){
	System.out.println(this.toString+" : duty_tm is null" );
}else{
	System.out.println(this.toString+" : duty_tm is "+duty_tm );
}
String base_alon = req.getParameter("base_alon");
if( base_alon == null){
	System.out.println(this.toString+" : base_alon is null" );
}else{
	System.out.println(this.toString+" : base_alon is "+base_alon );
}
String cmpn_alon = req.getParameter("cmpn_alon");
if( cmpn_alon == null){
	System.out.println(this.toString+" : cmpn_alon is null" );
}else{
	System.out.println(this.toString+" : cmpn_alon is "+cmpn_alon );
}
String alvc_occr_yn = req.getParameter("alvc_occr_yn");
if( alvc_occr_yn == null){
	System.out.println(this.toString+" : alvc_occr_yn is null" );
}else{
	System.out.println(this.toString+" : alvc_occr_yn is "+alvc_occr_yn );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String new_aply_basi_dt = Util.checkString(req.getParameter("new_aply_basi_dt"));
String aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String hody_clsf = Util.checkString(req.getParameter("hody_clsf"));
String obj_clsf = Util.checkString(req.getParameter("obj_clsf"));
String prsnt_hody_clsf = Util.checkString(req.getParameter("prsnt_hody_clsf"));
String finish_hody_clsf = Util.checkString(req.getParameter("finish_hody_clsf"));
String prsnt_tm = Util.checkString(req.getParameter("prsnt_tm"));
String finish_tm = Util.checkString(req.getParameter("finish_tm"));
String finish_dd_clsf = Util.checkString(req.getParameter("finish_dd_clsf"));
String duty_tm = Util.checkString(req.getParameter("duty_tm"));
String base_alon = Util.checkString(req.getParameter("base_alon"));
String cmpn_alon = Util.checkString(req.getParameter("cmpn_alon"));
String alvc_occr_yn = Util.checkString(req.getParameter("alvc_occr_yn"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String new_aply_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("new_aply_basi_dt")));
String aply_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_basi_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String hody_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hody_clsf")));
String obj_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_clsf")));
String prsnt_hody_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("prsnt_hody_clsf")));
String finish_hody_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("finish_hody_clsf")));
String prsnt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prsnt_tm")));
String finish_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("finish_tm")));
String finish_dd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("finish_dd_clsf")));
String duty_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_tm")));
String base_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("base_alon")));
String cmpn_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpn_alon")));
String alvc_occr_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("alvc_occr_yn")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setNew_aply_basi_dt(new_aply_basi_dt);
dm.setAply_basi_dt(aply_basi_dt);
dm.setSeq(seq);
dm.setHody_clsf(hody_clsf);
dm.setObj_clsf(obj_clsf);
dm.setPrsnt_hody_clsf(prsnt_hody_clsf);
dm.setFinish_hody_clsf(finish_hody_clsf);
dm.setPrsnt_tm(prsnt_tm);
dm.setFinish_tm(finish_tm);
dm.setFinish_dd_clsf(finish_dd_clsf);
dm.setDuty_tm(duty_tm);
dm.setBase_alon(base_alon);
dm.setCmpn_alon(cmpn_alon);
dm.setAlvc_occr_yn(alvc_occr_yn);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Oct 31 14:25:17 KST 2012 */