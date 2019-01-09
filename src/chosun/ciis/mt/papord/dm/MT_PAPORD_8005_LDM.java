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


package chosun.ciis.mt.papord.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.ds.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_8005_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String dual_out_clsf;
	public String pcnt;
	public String slip_qty;
	public String issu_dt;
	public String medi_cd;
	public String add_prt_seq;

	public MT_PAPORD_8005_LDM(){}
	public MT_PAPORD_8005_LDM(String cmpy_cd, String fac_clsf, String dual_out_clsf, String pcnt, String slip_qty, String issu_dt, String medi_cd, String add_prt_seq){
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.dual_out_clsf = dual_out_clsf;
		this.pcnt = pcnt;
		this.slip_qty = slip_qty;
		this.issu_dt = issu_dt;
		this.medi_cd = medi_cd;
		this.add_prt_seq = add_prt_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setDual_out_clsf(String dual_out_clsf){
		this.dual_out_clsf = dual_out_clsf;
	}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setAdd_prt_seq(String add_prt_seq){
		this.add_prt_seq = add_prt_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getDual_out_clsf(){
		return this.dual_out_clsf;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getAdd_prt_seq(){
		return this.add_prt_seq;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPORD_8005_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPORD_8005_LDM dm = (MT_PAPORD_8005_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fac_clsf);
		cstmt.setString(5, dm.dual_out_clsf);
		cstmt.setString(6, dm.pcnt);
		cstmt.setString(7, dm.slip_qty);
		cstmt.setString(8, dm.issu_dt);
		cstmt.setString(9, dm.medi_cd);
		cstmt.setString(10, dm.add_prt_seq);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papord.ds.MT_PAPORD_8005_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("dual_out_clsf = [" + getDual_out_clsf() + "]");
		System.out.println("pcnt = [" + getPcnt() + "]");
		System.out.println("slip_qty = [" + getSlip_qty() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("add_prt_seq = [" + getAdd_prt_seq() + "]");
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
String dual_out_clsf = req.getParameter("dual_out_clsf");
if( dual_out_clsf == null){
	System.out.println(this.toString+" : dual_out_clsf is null" );
}else{
	System.out.println(this.toString+" : dual_out_clsf is "+dual_out_clsf );
}
String pcnt = req.getParameter("pcnt");
if( pcnt == null){
	System.out.println(this.toString+" : pcnt is null" );
}else{
	System.out.println(this.toString+" : pcnt is "+pcnt );
}
String slip_qty = req.getParameter("slip_qty");
if( slip_qty == null){
	System.out.println(this.toString+" : slip_qty is null" );
}else{
	System.out.println(this.toString+" : slip_qty is "+slip_qty );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String add_prt_seq = req.getParameter("add_prt_seq");
if( add_prt_seq == null){
	System.out.println(this.toString+" : add_prt_seq is null" );
}else{
	System.out.println(this.toString+" : add_prt_seq is "+add_prt_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String dual_out_clsf = Util.checkString(req.getParameter("dual_out_clsf"));
String pcnt = Util.checkString(req.getParameter("pcnt"));
String slip_qty = Util.checkString(req.getParameter("slip_qty"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String add_prt_seq = Util.checkString(req.getParameter("add_prt_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String dual_out_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dual_out_clsf")));
String pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("pcnt")));
String slip_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_qty")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String add_prt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("add_prt_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setDual_out_clsf(dual_out_clsf);
dm.setPcnt(pcnt);
dm.setSlip_qty(slip_qty);
dm.setIssu_dt(issu_dt);
dm.setMedi_cd(medi_cd);
dm.setAdd_prt_seq(add_prt_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 08 17:55:17 KST 2016 */