/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 *
 */

public class HD_AFFR_4002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pont_clsf;
	public String pont;
	public String aply_basi_dt;
	public String seq;
	public String u_ipadd;
	public String u_id;
	public String mode;

	public HD_AFFR_4002_ADM(){}
	public HD_AFFR_4002_ADM(String cmpy_cd, String pont_clsf, String pont, String aply_basi_dt, String seq, String u_ipadd, String u_id, String mode){
		this.cmpy_cd = cmpy_cd;
		this.pont_clsf = pont_clsf;
		this.pont = pont;
		this.aply_basi_dt = aply_basi_dt;
		this.seq = seq;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPont_clsf(String pont_clsf){
		this.pont_clsf = pont_clsf;
	}

	public void setPont(String pont){
		this.pont = pont;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPont_clsf(){
		return this.pont_clsf;
	}

	public String getPont(){
		return this.pont;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_4002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_4002_ADM dm = (HD_AFFR_4002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pont_clsf);
		cstmt.setString(5, dm.pont);
		cstmt.setString(6, dm.aply_basi_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.u_ipadd);
		cstmt.setString(9, dm.u_id);
		cstmt.setString(10, dm.mode);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_4002_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("pont_clsf = " + getPont_clsf());
        System.out.println("pont = " + getPont());
        System.out.println("aply_basi_dt = " + getAply_basi_dt());
        System.out.println("seq = " + getSeq());
        System.out.println("u_ipadd = " + getU_ipadd());
        System.out.println("u_id = " + getU_id());
        System.out.println("mode = " + getMode());
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
String pont_clsf = req.getParameter("pont_clsf");
if( pont_clsf == null){
	System.out.println(this.toString+" : pont_clsf is null" );
}else{
	System.out.println(this.toString+" : pont_clsf is "+pont_clsf );
}
String pont = req.getParameter("pont");
if( pont == null){
	System.out.println(this.toString+" : pont is null" );
}else{
	System.out.println(this.toString+" : pont is "+pont );
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pont_clsf = Util.checkString(req.getParameter("pont_clsf"));
String pont = Util.checkString(req.getParameter("pont"));
String aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pont_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pont_clsf")));
String pont = Util.Uni2Ksc(Util.checkString(req.getParameter("pont")));
String aply_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_basi_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPont_clsf(pont_clsf);
dm.setPont(pont);
dm.setAply_basi_dt(aply_basi_dt);
dm.setSeq(seq);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 06 22:17:10 KST 2009 */