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


package chosun.ciis.mt.submatrout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.ds.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_1112_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String state;
	public String per_id;
	public String per_addr;

	public MT_SUBMATROUT_1112_UDM(){}
	public MT_SUBMATROUT_1112_UDM(String cmpy_cd, String occr_dt, String seq, String state, String per_id, String per_addr){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.state = state;
		this.per_id = per_id;
		this.per_addr = per_addr;
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

	public void setState(String state){
		this.state = state;
	}

	public void setPer_id(String per_id){
		this.per_id = per_id;
	}

	public void setPer_addr(String per_addr){
		this.per_addr = per_addr;
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

	public String getState(){
		return this.state;
	}

	public String getPer_id(){
		return this.per_id;
	}

	public String getPer_addr(){
		return this.per_addr;
	}

	public String getSQL(){
		 return "{ call SP_MT_SUBMATROUT_1112_U( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_1112_UDM dm = (MT_SUBMATROUT_1112_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.state);
		cstmt.setString(7, dm.per_id);
		cstmt.setString(8, dm.per_addr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_1112_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("seq = " + getSeq());
        System.out.println("state = " + getState());
        System.out.println("per_id = " + getPer_id());
        System.out.println("per_addr = " + getPer_addr());
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
String state = req.getParameter("state");
if( state == null){
	System.out.println(this.toString+" : state is null" );
}else{
	System.out.println(this.toString+" : state is "+state );
}
String per_id = req.getParameter("per_id");
if( per_id == null){
	System.out.println(this.toString+" : per_id is null" );
}else{
	System.out.println(this.toString+" : per_id is "+per_id );
}
String per_addr = req.getParameter("per_addr");
if( per_addr == null){
	System.out.println(this.toString+" : per_addr is null" );
}else{
	System.out.println(this.toString+" : per_addr is "+per_addr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String state = Util.checkString(req.getParameter("state"));
String per_id = Util.checkString(req.getParameter("per_id"));
String per_addr = Util.checkString(req.getParameter("per_addr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String state = Util.Uni2Ksc(Util.checkString(req.getParameter("state")));
String per_id = Util.Uni2Ksc(Util.checkString(req.getParameter("per_id")));
String per_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("per_addr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setState(state);
dm.setPer_id(per_id);
dm.setPer_addr(per_addr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 29 10:48:34 KST 2009 */