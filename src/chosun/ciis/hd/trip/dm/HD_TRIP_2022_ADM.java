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


package chosun.ciis.hd.trip.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.ds.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_2022_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String new_aply_basi_dt;
	public String aply_basi_dt;
	public String seq;
	public String pay_basi_clsf;
	public String dspch_clsf;
	public String base_alon;
	public String u_ipadd;
	public String u_id;

	public HD_TRIP_2022_ADM(){}
	public HD_TRIP_2022_ADM(String mode, String cmpy_cd, String new_aply_basi_dt, String aply_basi_dt, String seq, String pay_basi_clsf, String dspch_clsf, String base_alon, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.new_aply_basi_dt = new_aply_basi_dt;
		this.aply_basi_dt = aply_basi_dt;
		this.seq = seq;
		this.pay_basi_clsf = pay_basi_clsf;
		this.dspch_clsf = dspch_clsf;
		this.base_alon = base_alon;
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

	public void setPay_basi_clsf(String pay_basi_clsf){
		this.pay_basi_clsf = pay_basi_clsf;
	}

	public void setDspch_clsf(String dspch_clsf){
		this.dspch_clsf = dspch_clsf;
	}

	public void setBase_alon(String base_alon){
		this.base_alon = base_alon;
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

	public String getPay_basi_clsf(){
		return this.pay_basi_clsf;
	}

	public String getDspch_clsf(){
		return this.dspch_clsf;
	}

	public String getBase_alon(){
		return this.base_alon;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_2022_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_2022_ADM dm = (HD_TRIP_2022_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.new_aply_basi_dt);
		cstmt.setString(6, dm.aply_basi_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.pay_basi_clsf);
		cstmt.setString(9, dm.dspch_clsf);
		cstmt.setString(10, dm.base_alon);
		cstmt.setString(11, dm.u_ipadd);
		cstmt.setString(12, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_2022_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("new_aply_basi_dt = [" + getNew_aply_basi_dt() + "]");
		System.out.println("aply_basi_dt = [" + getAply_basi_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("pay_basi_clsf = [" + getPay_basi_clsf() + "]");
		System.out.println("dspch_clsf = [" + getDspch_clsf() + "]");
		System.out.println("base_alon = [" + getBase_alon() + "]");
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
String pay_basi_clsf = req.getParameter("pay_basi_clsf");
if( pay_basi_clsf == null){
	System.out.println(this.toString+" : pay_basi_clsf is null" );
}else{
	System.out.println(this.toString+" : pay_basi_clsf is "+pay_basi_clsf );
}
String dspch_clsf = req.getParameter("dspch_clsf");
if( dspch_clsf == null){
	System.out.println(this.toString+" : dspch_clsf is null" );
}else{
	System.out.println(this.toString+" : dspch_clsf is "+dspch_clsf );
}
String base_alon = req.getParameter("base_alon");
if( base_alon == null){
	System.out.println(this.toString+" : base_alon is null" );
}else{
	System.out.println(this.toString+" : base_alon is "+base_alon );
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
String pay_basi_clsf = Util.checkString(req.getParameter("pay_basi_clsf"));
String dspch_clsf = Util.checkString(req.getParameter("dspch_clsf"));
String base_alon = Util.checkString(req.getParameter("base_alon"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String new_aply_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("new_aply_basi_dt")));
String aply_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_basi_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String pay_basi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_basi_clsf")));
String dspch_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dspch_clsf")));
String base_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("base_alon")));
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
dm.setPay_basi_clsf(pay_basi_clsf);
dm.setDspch_clsf(dspch_clsf);
dm.setBase_alon(base_alon);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 12 17:16:35 KST 2009 */