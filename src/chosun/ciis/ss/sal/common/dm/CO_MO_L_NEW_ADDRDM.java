/***************************************************************************************************
 * 파일명 : CO_MO_L_NEW_ADDRDM.java_모바일용
 * 기능 : 공통-구군목록
 * 작성일자 : 2017-02-17
 * 작성자 : 장선희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sal.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 *
 */


public class CO_MO_L_NEW_ADDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String sido;
	public String gugun;
	public String rdnm;
	public String bldgnn1;
	public String bldgnn2;
	public String bldgnm;
	public String dong;
	public String bnji1;
	public String bnji2;
	public String job_flag;
	public String bocd;
	public String orderby;
	public long pageno;
	public long pagesize;

	public CO_MO_L_NEW_ADDRDM(){}
	public CO_MO_L_NEW_ADDRDM(String sido, String gugun, String rdnm, String bldgnn1, String bldgnn2, String bldgnm, String dong, String bnji1, String bnji2, String job_flag, String bocd, String orderby, long pageno, long pagesize){
		this.sido = sido;
		this.gugun = gugun;
		this.rdnm = rdnm;
		this.bldgnn1 = bldgnn1;
		this.bldgnn2 = bldgnn2;
		this.bldgnm = bldgnm;
		this.dong = dong;
		this.bnji1 = bnji1;
		this.bnji2 = bnji2;
		this.job_flag = job_flag;
		this.bocd = bocd;
		this.orderby = orderby;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setSido(String sido){
		this.sido = sido;
	}

	public void setGugun(String gugun){
		this.gugun = gugun;
	}

	public void setRdnm(String rdnm){
		this.rdnm = rdnm;
	}

	public void setBldgnn1(String bldgnn1){
		this.bldgnn1 = bldgnn1;
	}

	public void setBldgnn2(String bldgnn2){
		this.bldgnn2 = bldgnn2;
	}

	public void setBldgnm(String bldgnm){
		this.bldgnm = bldgnm;
	}

	public void setDong(String dong){
		this.dong = dong;
	}

	public void setBnji1(String bnji1){
		this.bnji1 = bnji1;
	}

	public void setBnji2(String bnji2){
		this.bnji2 = bnji2;
	}

	public void setJob_flag(String job_flag){
		this.job_flag = job_flag;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setOrderby(String orderby){
		this.orderby = orderby;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getSido(){
		return this.sido;
	}

	public String getGugun(){
		return this.gugun;
	}

	public String getRdnm(){
		return this.rdnm;
	}

	public String getBldgnn1(){
		return this.bldgnn1;
	}

	public String getBldgnn2(){
		return this.bldgnn2;
	}

	public String getBldgnm(){
		return this.bldgnm;
	}

	public String getDong(){
		return this.dong;
	}

	public String getBnji1(){
		return this.bnji1;
	}

	public String getBnji2(){
		return this.bnji2;
	}

	public String getJob_flag(){
		return this.job_flag;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getOrderby(){
		return this.orderby;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_CO_MO_L_NEW_ADDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_MO_L_NEW_ADDRDM dm = (CO_MO_L_NEW_ADDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.sido);
		cstmt.setString(4, dm.gugun);
		cstmt.setString(5, dm.rdnm);
		cstmt.setString(6, dm.bldgnn1);
		cstmt.setString(7, dm.bldgnn2);
		cstmt.setString(8, dm.bldgnm);
		cstmt.setString(9, dm.dong);
		cstmt.setString(10, dm.bnji1);
		cstmt.setString(11, dm.bnji2);
		cstmt.setString(12, dm.job_flag);
		cstmt.setString(13, dm.bocd);
		cstmt.setString(14, dm.orderby);
		cstmt.setLong(15, dm.pageno);
		cstmt.setLong(16, dm.pagesize);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.common.ds.CO_MO_L_NEW_ADDRDataSet();
	}



    public void print(){
        System.out.println("sido = " + getSido());
        System.out.println("gugun = " + getGugun());
        System.out.println("rdnm = " + getRdnm());
        System.out.println("bldgnn1 = " + getBldgnn1());
        System.out.println("bldgnn2 = " + getBldgnn2());
        System.out.println("bldgnm = " + getBldgnm());
        System.out.println("dong = " + getDong());
        System.out.println("bnji1 = " + getBnji1());
        System.out.println("bnji2 = " + getBnji2());
        System.out.println("job_flag = " + getJob_flag());
        System.out.println("bocd = " + getBocd());
        System.out.println("orderby = " + getOrderby());
        System.out.println("pageno = " + getPageno());
        System.out.println("pagesize = " + getPagesize());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String sido = req.getParameter("sido");
if( sido == null){
	System.out.println(this.toString+" : sido is null" );
}else{
	System.out.println(this.toString+" : sido is "+sido );
}
String gugun = req.getParameter("gugun");
if( gugun == null){
	System.out.println(this.toString+" : gugun is null" );
}else{
	System.out.println(this.toString+" : gugun is "+gugun );
}
String rdnm = req.getParameter("rdnm");
if( rdnm == null){
	System.out.println(this.toString+" : rdnm is null" );
}else{
	System.out.println(this.toString+" : rdnm is "+rdnm );
}
String bldgnn1 = req.getParameter("bldgnn1");
if( bldgnn1 == null){
	System.out.println(this.toString+" : bldgnn1 is null" );
}else{
	System.out.println(this.toString+" : bldgnn1 is "+bldgnn1 );
}
String bldgnn2 = req.getParameter("bldgnn2");
if( bldgnn2 == null){
	System.out.println(this.toString+" : bldgnn2 is null" );
}else{
	System.out.println(this.toString+" : bldgnn2 is "+bldgnn2 );
}
String bldgnm = req.getParameter("bldgnm");
if( bldgnm == null){
	System.out.println(this.toString+" : bldgnm is null" );
}else{
	System.out.println(this.toString+" : bldgnm is "+bldgnm );
}
String dong = req.getParameter("dong");
if( dong == null){
	System.out.println(this.toString+" : dong is null" );
}else{
	System.out.println(this.toString+" : dong is "+dong );
}
String bnji1 = req.getParameter("bnji1");
if( bnji1 == null){
	System.out.println(this.toString+" : bnji1 is null" );
}else{
	System.out.println(this.toString+" : bnji1 is "+bnji1 );
}
String bnji2 = req.getParameter("bnji2");
if( bnji2 == null){
	System.out.println(this.toString+" : bnji2 is null" );
}else{
	System.out.println(this.toString+" : bnji2 is "+bnji2 );
}
String job_flag = req.getParameter("job_flag");
if( job_flag == null){
	System.out.println(this.toString+" : job_flag is null" );
}else{
	System.out.println(this.toString+" : job_flag is "+job_flag );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String orderby = req.getParameter("orderby");
if( orderby == null){
	System.out.println(this.toString+" : orderby is null" );
}else{
	System.out.println(this.toString+" : orderby is "+orderby );
}
String pageno = req.getParameter("pageno");
if( pageno == null){
	System.out.println(this.toString+" : pageno is null" );
}else{
	System.out.println(this.toString+" : pageno is "+pageno );
}
String pagesize = req.getParameter("pagesize");
if( pagesize == null){
	System.out.println(this.toString+" : pagesize is null" );
}else{
	System.out.println(this.toString+" : pagesize is "+pagesize );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String sido = Util.checkString(req.getParameter("sido"));
String gugun = Util.checkString(req.getParameter("gugun"));
String rdnm = Util.checkString(req.getParameter("rdnm"));
String bldgnn1 = Util.checkString(req.getParameter("bldgnn1"));
String bldgnn2 = Util.checkString(req.getParameter("bldgnn2"));
String bldgnm = Util.checkString(req.getParameter("bldgnm"));
String dong = Util.checkString(req.getParameter("dong"));
String bnji1 = Util.checkString(req.getParameter("bnji1"));
String bnji2 = Util.checkString(req.getParameter("bnji2"));
String job_flag = Util.checkString(req.getParameter("job_flag"));
String bocd = Util.checkString(req.getParameter("bocd"));
String orderby = Util.checkString(req.getParameter("orderby"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String sido = Util.Uni2Ksc(Util.checkString(req.getParameter("sido")));
String gugun = Util.Uni2Ksc(Util.checkString(req.getParameter("gugun")));
String rdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdnm")));
String bldgnn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("bldgnn1")));
String bldgnn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("bldgnn2")));
String bldgnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bldgnm")));
String dong = Util.Uni2Ksc(Util.checkString(req.getParameter("dong")));
String bnji1 = Util.Uni2Ksc(Util.checkString(req.getParameter("bnji1")));
String bnji2 = Util.Uni2Ksc(Util.checkString(req.getParameter("bnji2")));
String job_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("job_flag")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String orderby = Util.Uni2Ksc(Util.checkString(req.getParameter("orderby")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSido(sido);
dm.setGugun(gugun);
dm.setRdnm(rdnm);
dm.setBldgnn1(bldgnn1);
dm.setBldgnn2(bldgnn2);
dm.setBldgnm(bldgnm);
dm.setDong(dong);
dm.setBnji1(bnji1);
dm.setBnji2(bnji2);
dm.setJob_flag(job_flag);
dm.setBocd(bocd);
dm.setOrderby(orderby);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 10 10:47:17 KST 2017 */