/***************************************************************************************************
* 파일명 : SS_L_MOVM_RDRDM.java
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 독자번호도 검색할 수 있도록 추가
* 수정자 :   장선희
* 수정일자 : 2015.08.10
* 백업 :
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 등록기간, 인계기간, 인수기간, 상담원기간, 상담원 별 조회 가능하도록 추가
* 수정자 :   장선희
* 수정일자 : 2015.10.29
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.move.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.move.rec.*;


public class SS_L_MOVM_RDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String frdt;
	public String todt;
	public String trsf_frdt;
	public String trsf_todt;
	public String acpt_frdt;
	public String acpt_todt;
	public String agent_frdt;
	public String agent_todt;
	public String agent_id;
	public String rdrnm;
	public String rdr_no;
	public String inout;
	public String move;
	public String medicd;
	public String proccd;
	public String aplcpathcd;
	public String basivalqty;
	public String post_dlvyn;
	public String inbo;
	public String movmrdrtype;
	public String rstsubsmonth;
	public long pageno;
	public long pagesize;

	public SS_L_MOVM_RDRDM(){}
	public SS_L_MOVM_RDRDM(String deptcd, String partcd, String areacd, String bocd, String frdt, String todt, String trsf_frdt, String trsf_todt, String acpt_frdt, String acpt_todt, String agent_frdt, String agent_todt, String agent_id, String rdrnm, String rdr_no, String inout, String move, String medicd, String proccd, String aplcpathcd, String basivalqty, String post_dlvyn, String inbo, String movmrdrtype, String rstsubsmonth, long pageno, long pagesize){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.frdt = frdt;
		this.todt = todt;
		this.trsf_frdt = trsf_frdt;
		this.trsf_todt = trsf_todt;
		this.acpt_frdt = acpt_frdt;
		this.acpt_todt = acpt_todt;
		this.agent_frdt = agent_frdt;
		this.agent_todt = agent_todt;
		this.agent_id = agent_id;
		this.rdrnm = rdrnm;
		this.rdr_no = rdr_no;
		this.inout = inout;
		this.move = move;
		this.medicd = medicd;
		this.proccd = proccd;
		this.aplcpathcd = aplcpathcd;
		this.basivalqty = basivalqty;
		this.post_dlvyn = post_dlvyn;
		this.inbo = inbo;
		this.movmrdrtype = movmrdrtype;
		this.rstsubsmonth = rstsubsmonth;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setTrsf_frdt(String trsf_frdt){
		this.trsf_frdt = trsf_frdt;
	}

	public void setTrsf_todt(String trsf_todt){
		this.trsf_todt = trsf_todt;
	}

	public void setAcpt_frdt(String acpt_frdt){
		this.acpt_frdt = acpt_frdt;
	}

	public void setAcpt_todt(String acpt_todt){
		this.acpt_todt = acpt_todt;
	}

	public void setAgent_frdt(String agent_frdt){
		this.agent_frdt = agent_frdt;
	}

	public void setAgent_todt(String agent_todt){
		this.agent_todt = agent_todt;
	}

	public void setAgent_id(String agent_id){
		this.agent_id = agent_id;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setInout(String inout){
		this.inout = inout;
	}

	public void setMove(String move){
		this.move = move;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setProccd(String proccd){
		this.proccd = proccd;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setBasivalqty(String basivalqty){
		this.basivalqty = basivalqty;
	}

	public void setPost_dlvyn(String post_dlvyn){
		this.post_dlvyn = post_dlvyn;
	}

	public void setInbo(String inbo){
		this.inbo = inbo;
	}

	public void setMovmrdrtype(String movmrdrtype){
		this.movmrdrtype = movmrdrtype;
	}

	public void setRstsubsmonth(String rstsubsmonth){
		this.rstsubsmonth = rstsubsmonth;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getTrsf_frdt(){
		return this.trsf_frdt;
	}

	public String getTrsf_todt(){
		return this.trsf_todt;
	}

	public String getAcpt_frdt(){
		return this.acpt_frdt;
	}

	public String getAcpt_todt(){
		return this.acpt_todt;
	}

	public String getAgent_frdt(){
		return this.agent_frdt;
	}

	public String getAgent_todt(){
		return this.agent_todt;
	}

	public String getAgent_id(){
		return this.agent_id;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getInout(){
		return this.inout;
	}

	public String getMove(){
		return this.move;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getProccd(){
		return this.proccd;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getBasivalqty(){
		return this.basivalqty;
	}

	public String getPost_dlvyn(){
		return this.post_dlvyn;
	}

	public String getInbo(){
		return this.inbo;
	}

	public String getMovmrdrtype(){
		return this.movmrdrtype;
	}

	public String getRstsubsmonth(){
		return this.rstsubsmonth;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_MOVM_RDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_MOVM_RDRDM dm = (SS_L_MOVM_RDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.frdt);
		cstmt.setString(8, dm.todt);
		cstmt.setString(9, dm.trsf_frdt);
		cstmt.setString(10, dm.trsf_todt);
		cstmt.setString(11, dm.acpt_frdt);
		cstmt.setString(12, dm.acpt_todt);
		cstmt.setString(13, dm.agent_frdt);
		cstmt.setString(14, dm.agent_todt);
		cstmt.setString(15, dm.agent_id);
		cstmt.setString(16, dm.rdrnm);
		cstmt.setString(17, dm.rdr_no);
		cstmt.setString(18, dm.inout);
		cstmt.setString(19, dm.move);
		cstmt.setString(20, dm.medicd);
		cstmt.setString(21, dm.proccd);
		cstmt.setString(22, dm.aplcpathcd);
		cstmt.setString(23, dm.basivalqty);
		cstmt.setString(24, dm.post_dlvyn);
		cstmt.setString(25, dm.inbo);
		cstmt.setString(26, dm.movmrdrtype);
		cstmt.setString(27, dm.rstsubsmonth);
		cstmt.setLong(28, dm.pageno);
		cstmt.setLong(29, dm.pagesize);
		cstmt.registerOutParameter(30, OracleTypes.CURSOR);
		cstmt.registerOutParameter(31, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.move.ds.SS_L_MOVM_RDRDataSet();
	}



    public void print(){
        System.out.println("deptcd = " + getDeptcd());
        System.out.println("partcd = " + getPartcd());
        System.out.println("areacd = " + getAreacd());
        System.out.println("bocd = " + getBocd());
        System.out.println("frdt = " + getFrdt());
        System.out.println("todt = " + getTodt());
        System.out.println("trsf_frdt = " + getTrsf_frdt());
        System.out.println("trsf_todt = " + getTrsf_todt());
        System.out.println("acpt_frdt = " + getAcpt_frdt());
        System.out.println("acpt_todt = " + getAcpt_todt());
        System.out.println("agent_frdt = " + getAgent_frdt());
        System.out.println("agent_todt = " + getAgent_todt());
        System.out.println("agent_id = " + getAgent_id());
        System.out.println("rdrnm = " + getRdrnm());
        System.out.println("rdr_no = " + getRdr_no());
        System.out.println("inout = " + getInout());
        System.out.println("move = " + getMove());
        System.out.println("medicd = " + getMedicd());
        System.out.println("proccd = " + getProccd());
        System.out.println("aplcpathcd = " + getAplcpathcd());
        System.out.println("basivalqty = " + getBasivalqty());
        System.out.println("post_dlvyn = " + getPost_dlvyn());
        System.out.println("inbo = " + getInbo());
        System.out.println("movmrdrtype = " + getMovmrdrtype());
        System.out.println("rstsubsmonth = " + getRstsubsmonth());
        System.out.println("pageno = " + getPageno());
        System.out.println("pagesize = " + getPagesize());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String partcd = req.getParameter("partcd");
if( partcd == null){
	System.out.println(this.toString+" : partcd is null" );
}else{
	System.out.println(this.toString+" : partcd is "+partcd );
}
String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String trsf_frdt = req.getParameter("trsf_frdt");
if( trsf_frdt == null){
	System.out.println(this.toString+" : trsf_frdt is null" );
}else{
	System.out.println(this.toString+" : trsf_frdt is "+trsf_frdt );
}
String trsf_todt = req.getParameter("trsf_todt");
if( trsf_todt == null){
	System.out.println(this.toString+" : trsf_todt is null" );
}else{
	System.out.println(this.toString+" : trsf_todt is "+trsf_todt );
}
String acpt_frdt = req.getParameter("acpt_frdt");
if( acpt_frdt == null){
	System.out.println(this.toString+" : acpt_frdt is null" );
}else{
	System.out.println(this.toString+" : acpt_frdt is "+acpt_frdt );
}
String acpt_todt = req.getParameter("acpt_todt");
if( acpt_todt == null){
	System.out.println(this.toString+" : acpt_todt is null" );
}else{
	System.out.println(this.toString+" : acpt_todt is "+acpt_todt );
}
String agent_frdt = req.getParameter("agent_frdt");
if( agent_frdt == null){
	System.out.println(this.toString+" : agent_frdt is null" );
}else{
	System.out.println(this.toString+" : agent_frdt is "+agent_frdt );
}
String agent_todt = req.getParameter("agent_todt");
if( agent_todt == null){
	System.out.println(this.toString+" : agent_todt is null" );
}else{
	System.out.println(this.toString+" : agent_todt is "+agent_todt );
}
String agent_id = req.getParameter("agent_id");
if( agent_id == null){
	System.out.println(this.toString+" : agent_id is null" );
}else{
	System.out.println(this.toString+" : agent_id is "+agent_id );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String inout = req.getParameter("inout");
if( inout == null){
	System.out.println(this.toString+" : inout is null" );
}else{
	System.out.println(this.toString+" : inout is "+inout );
}
String move = req.getParameter("move");
if( move == null){
	System.out.println(this.toString+" : move is null" );
}else{
	System.out.println(this.toString+" : move is "+move );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String proccd = req.getParameter("proccd");
if( proccd == null){
	System.out.println(this.toString+" : proccd is null" );
}else{
	System.out.println(this.toString+" : proccd is "+proccd );
}
String aplcpathcd = req.getParameter("aplcpathcd");
if( aplcpathcd == null){
	System.out.println(this.toString+" : aplcpathcd is null" );
}else{
	System.out.println(this.toString+" : aplcpathcd is "+aplcpathcd );
}
String basivalqty = req.getParameter("basivalqty");
if( basivalqty == null){
	System.out.println(this.toString+" : basivalqty is null" );
}else{
	System.out.println(this.toString+" : basivalqty is "+basivalqty );
}
String post_dlvyn = req.getParameter("post_dlvyn");
if( post_dlvyn == null){
	System.out.println(this.toString+" : post_dlvyn is null" );
}else{
	System.out.println(this.toString+" : post_dlvyn is "+post_dlvyn );
}
String inbo = req.getParameter("inbo");
if( inbo == null){
	System.out.println(this.toString+" : inbo is null" );
}else{
	System.out.println(this.toString+" : inbo is "+inbo );
}
String movmrdrtype = req.getParameter("movmrdrtype");
if( movmrdrtype == null){
	System.out.println(this.toString+" : movmrdrtype is null" );
}else{
	System.out.println(this.toString+" : movmrdrtype is "+movmrdrtype );
}
String rstsubsmonth = req.getParameter("rstsubsmonth");
if( rstsubsmonth == null){
	System.out.println(this.toString+" : rstsubsmonth is null" );
}else{
	System.out.println(this.toString+" : rstsubsmonth is "+rstsubsmonth );
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

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String trsf_frdt = Util.checkString(req.getParameter("trsf_frdt"));
String trsf_todt = Util.checkString(req.getParameter("trsf_todt"));
String acpt_frdt = Util.checkString(req.getParameter("acpt_frdt"));
String acpt_todt = Util.checkString(req.getParameter("acpt_todt"));
String agent_frdt = Util.checkString(req.getParameter("agent_frdt"));
String agent_todt = Util.checkString(req.getParameter("agent_todt"));
String agent_id = Util.checkString(req.getParameter("agent_id"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String inout = Util.checkString(req.getParameter("inout"));
String move = Util.checkString(req.getParameter("move"));
String medicd = Util.checkString(req.getParameter("medicd"));
String proccd = Util.checkString(req.getParameter("proccd"));
String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
String basivalqty = Util.checkString(req.getParameter("basivalqty"));
String post_dlvyn = Util.checkString(req.getParameter("post_dlvyn"));
String inbo = Util.checkString(req.getParameter("inbo"));
String movmrdrtype = Util.checkString(req.getParameter("movmrdrtype"));
String rstsubsmonth = Util.checkString(req.getParameter("rstsubsmonth"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String trsf_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("trsf_frdt")));
String trsf_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("trsf_todt")));
String acpt_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("acpt_frdt")));
String acpt_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("acpt_todt")));
String agent_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("agent_frdt")));
String agent_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("agent_todt")));
String agent_id = Util.Uni2Ksc(Util.checkString(req.getParameter("agent_id")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String inout = Util.Uni2Ksc(Util.checkString(req.getParameter("inout")));
String move = Util.Uni2Ksc(Util.checkString(req.getParameter("move")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String proccd = Util.Uni2Ksc(Util.checkString(req.getParameter("proccd")));
String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
String basivalqty = Util.Uni2Ksc(Util.checkString(req.getParameter("basivalqty")));
String post_dlvyn = Util.Uni2Ksc(Util.checkString(req.getParameter("post_dlvyn")));
String inbo = Util.Uni2Ksc(Util.checkString(req.getParameter("inbo")));
String movmrdrtype = Util.Uni2Ksc(Util.checkString(req.getParameter("movmrdrtype")));
String rstsubsmonth = Util.Uni2Ksc(Util.checkString(req.getParameter("rstsubsmonth")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setTrsf_frdt(trsf_frdt);
dm.setTrsf_todt(trsf_todt);
dm.setAcpt_frdt(acpt_frdt);
dm.setAcpt_todt(acpt_todt);
dm.setAgent_frdt(agent_frdt);
dm.setAgent_todt(agent_todt);
dm.setAgent_id(agent_id);
dm.setRdrnm(rdrnm);
dm.setRdr_no(rdr_no);
dm.setInout(inout);
dm.setMove(move);
dm.setMedicd(medicd);
dm.setProccd(proccd);
dm.setAplcpathcd(aplcpathcd);
dm.setBasivalqty(basivalqty);
dm.setPost_dlvyn(post_dlvyn);
dm.setInbo(inbo);
dm.setMovmrdrtype(movmrdrtype);
dm.setRstsubsmonth(rstsubsmonth);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 29 21:37:09 KST 2015 */