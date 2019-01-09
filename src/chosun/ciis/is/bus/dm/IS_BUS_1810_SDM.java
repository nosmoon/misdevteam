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


package chosun.ciis.is.bus.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.ds.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_1810_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String preng_dt;
	public String sale_clsf;
	public String spcsale_clsf;
	public String seq;

	public IS_BUS_1810_SDM(){}
	public IS_BUS_1810_SDM(String cmpy_cd, String preng_dt, String sale_clsf, String spcsale_clsf, String seq){
		this.cmpy_cd = cmpy_cd;
		this.preng_dt = preng_dt;
		this.sale_clsf = sale_clsf;
		this.spcsale_clsf = spcsale_clsf;
		this.seq = seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPreng_dt(String preng_dt){
		this.preng_dt = preng_dt;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setSpcsale_clsf(String spcsale_clsf){
		this.spcsale_clsf = spcsale_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPreng_dt(){
		return this.preng_dt;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getSpcsale_clsf(){
		return this.spcsale_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BUS_1810_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BUS_1810_SDM dm = (IS_BUS_1810_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.preng_dt);
		cstmt.setString(5, dm.sale_clsf);
		cstmt.setString(6, dm.spcsale_clsf);
		cstmt.setString(7, dm.seq);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bus.ds.IS_BUS_1810_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("preng_dt = [" + getPreng_dt() + "]");
		System.out.println("sale_clsf = [" + getSale_clsf() + "]");
		System.out.println("spcsale_clsf = [" + getSpcsale_clsf() + "]");
		System.out.println("seq = [" + getSeq() + "]");
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
String preng_dt = req.getParameter("preng_dt");
if( preng_dt == null){
	System.out.println(this.toString+" : preng_dt is null" );
}else{
	System.out.println(this.toString+" : preng_dt is "+preng_dt );
}
String sale_clsf = req.getParameter("sale_clsf");
if( sale_clsf == null){
	System.out.println(this.toString+" : sale_clsf is null" );
}else{
	System.out.println(this.toString+" : sale_clsf is "+sale_clsf );
}
String spcsale_clsf = req.getParameter("spcsale_clsf");
if( spcsale_clsf == null){
	System.out.println(this.toString+" : spcsale_clsf is null" );
}else{
	System.out.println(this.toString+" : spcsale_clsf is "+spcsale_clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String preng_dt = Util.checkString(req.getParameter("preng_dt"));
String sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
String spcsale_clsf = Util.checkString(req.getParameter("spcsale_clsf"));
String seq = Util.checkString(req.getParameter("seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String preng_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_dt")));
String sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_clsf")));
String spcsale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("spcsale_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPreng_dt(preng_dt);
dm.setSale_clsf(sale_clsf);
dm.setSpcsale_clsf(spcsale_clsf);
dm.setSeq(seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 20 20:14:35 KST 2012 */