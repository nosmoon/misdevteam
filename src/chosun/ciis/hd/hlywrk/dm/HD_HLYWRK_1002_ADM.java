/***************************************************************************************************
* 파일명 : HD_HLYWRK_1002_ADM.java
* 기능 : 휴일근무관리
* 작성일자 : 2009.04.20
* 작성자 : 강영슬
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
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


public class HD_HLYWRK_1002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String new_aply_basi_dt;
	public String aply_basi_dt;
	public String seq;
	public String hody_clsf;
	public String obj_clsf;
	public String base_alon;
	public String cmpn_alon;
	public String u_ipadd;
	public String u_id;

	public HD_HLYWRK_1002_ADM(){}
	public HD_HLYWRK_1002_ADM(String mode, String cmpy_cd, String new_aply_basi_dt, String aply_basi_dt, String seq, String hody_clsf, String obj_clsf, String base_alon, String cmpn_alon, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.new_aply_basi_dt = new_aply_basi_dt;
		this.aply_basi_dt = aply_basi_dt;
		this.seq = seq;
		this.hody_clsf = hody_clsf;
		this.obj_clsf = obj_clsf;
		this.base_alon = base_alon;
		this.cmpn_alon = cmpn_alon;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

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

	public void setBase_alon(String base_alon){
		this.base_alon = base_alon;
	}

	public void setCmpn_alon(String cmpn_alon){
		this.cmpn_alon = cmpn_alon;
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

	public String getBase_alon(){
		return this.base_alon;
	}

	public String getCmpn_alon(){
		return this.cmpn_alon;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_HLYWRK_1002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_HLYWRK_1002_ADM dm = (HD_HLYWRK_1002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.new_aply_basi_dt);
		cstmt.setString(6, dm.aply_basi_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.hody_clsf);
		cstmt.setString(9, dm.obj_clsf);
		cstmt.setString(10, dm.base_alon);
		cstmt.setString(11, dm.cmpn_alon);
		cstmt.setString(12, dm.u_ipadd);
		cstmt.setString(13, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.hlywrk.ds.HD_HLYWRK_1002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("new_aply_basi_dt = [" + getNew_aply_basi_dt() + "]");
		System.out.println("aply_basi_dt = [" + getAply_basi_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("hody_clsf = [" + getHody_clsf() + "]");
		System.out.println("obj_clsf = [" + getObj_clsf() + "]");
		System.out.println("base_alon = [" + getBase_alon() + "]");
		System.out.println("cmpn_alon = [" + getCmpn_alon() + "]");
		System.out.println("u_ipadd = [" + getU_ipadd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
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
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String new_aply_basi_dt = Util.checkString(req.getParameter("new_aply_basi_dt"));
String aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String hody_clsf = Util.checkString(req.getParameter("hody_clsf"));
String obj_clsf = Util.checkString(req.getParameter("obj_clsf"));
String base_alon = Util.checkString(req.getParameter("base_alon"));
String cmpn_alon = Util.checkString(req.getParameter("cmpn_alon"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String new_aply_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("new_aply_basi_dt")));
String aply_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_basi_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String hody_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hody_clsf")));
String obj_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_clsf")));
String base_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("base_alon")));
String cmpn_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpn_alon")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setNew_aply_basi_dt(new_aply_basi_dt);
dm.setAply_basi_dt(aply_basi_dt);
dm.setSeq(seq);
dm.setHody_clsf(hody_clsf);
dm.setObj_clsf(obj_clsf);
dm.setBase_alon(base_alon);
dm.setCmpn_alon(cmpn_alon);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 17 15:14:16 KST 2009 */