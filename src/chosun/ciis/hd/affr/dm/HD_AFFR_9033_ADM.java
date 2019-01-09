/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
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


public class HD_AFFR_9033_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String basi_yy;
	public String basi_no;
	public String seq;
	public String otn_mgng_cd;

	public HD_AFFR_9033_ADM(){}
	public HD_AFFR_9033_ADM(String cmpy_cd, String mode, String basi_yy, String basi_no, String seq, String otn_mgng_cd){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.basi_yy = basi_yy;
		this.basi_no = basi_no;
		this.seq = seq;
		this.otn_mgng_cd = otn_mgng_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setBasi_yy(String basi_yy){
		this.basi_yy = basi_yy;
	}

	public void setBasi_no(String basi_no){
		this.basi_no = basi_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOtn_mgng_cd(String otn_mgng_cd){
		this.otn_mgng_cd = otn_mgng_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getBasi_yy(){
		return this.basi_yy;
	}

	public String getBasi_no(){
		return this.basi_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOtn_mgng_cd(){
		return this.otn_mgng_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_9033_A(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_9033_ADM dm = (HD_AFFR_9033_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.basi_yy);
		cstmt.setString(6, dm.basi_no);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.otn_mgng_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_9033_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("basi_yy = [" + getBasi_yy() + "]");
		System.out.println("basi_no = [" + getBasi_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("otn_mgng_cd = [" + getOtn_mgng_cd() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String basi_yy = req.getParameter("basi_yy");
if( basi_yy == null){
	System.out.println(this.toString+" : basi_yy is null" );
}else{
	System.out.println(this.toString+" : basi_yy is "+basi_yy );
}
String basi_no = req.getParameter("basi_no");
if( basi_no == null){
	System.out.println(this.toString+" : basi_no is null" );
}else{
	System.out.println(this.toString+" : basi_no is "+basi_no );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String otn_mgng_cd = req.getParameter("otn_mgng_cd");
if( otn_mgng_cd == null){
	System.out.println(this.toString+" : otn_mgng_cd is null" );
}else{
	System.out.println(this.toString+" : otn_mgng_cd is "+otn_mgng_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String basi_yy = Util.checkString(req.getParameter("basi_yy"));
String basi_no = Util.checkString(req.getParameter("basi_no"));
String seq = Util.checkString(req.getParameter("seq"));
String otn_mgng_cd = Util.checkString(req.getParameter("otn_mgng_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String basi_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yy")));
String basi_no = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String otn_mgng_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("otn_mgng_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setBasi_yy(basi_yy);
dm.setBasi_no(basi_no);
dm.setSeq(seq);
dm.setOtn_mgng_cd(otn_mgng_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 16 09:57:52 KST 2016 */