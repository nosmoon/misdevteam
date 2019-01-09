/***************************************************************************************************
 * 파일명   : SP_SL_A_BNSITEM
 * 기능     : 관리자-판촉코드-입력/수정/삭제
 * 작성일자 : 2007/05/25
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
**  SP_SL_A_BNSITEM
**/

public class SL_A_BNSITEMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String incmgpers;
	public String bns_itemcd;
	public String bns_itemnm;
	public long uprc;
	public String mnftwon;
	public String spec;
	public String remk;
	public String useclsf;
	public String useyn;

	public SL_A_BNSITEMDM(){}
	public SL_A_BNSITEMDM(String accflag, String incmgpers, String bns_itemcd, String bns_itemnm, long uprc, String mnftwon, String spec, String remk, String useclsf, String useyn){
		this.accflag = accflag;
		this.incmgpers = incmgpers;
		this.bns_itemcd = bns_itemcd;
		this.bns_itemnm = bns_itemnm;
		this.uprc = uprc;
		this.mnftwon = mnftwon;
		this.spec = spec;
		this.remk = remk;
		this.useclsf = useclsf;
		this.useyn = useyn;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setBns_itemnm(String bns_itemnm){
		this.bns_itemnm = bns_itemnm;
	}

	public void setUprc(long uprc){
		this.uprc = uprc;
	}

	public void setMnftwon(String mnftwon){
		this.mnftwon = mnftwon;
	}

	public void setSpec(String spec){
		this.spec = spec;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setUseclsf(String useclsf){
		this.useclsf = useclsf;
	}

	public void setUseyn(String useyn){
		this.useyn = useyn;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public String getBns_itemnm(){
		return this.bns_itemnm;
	}

	public long getUprc(){
		return this.uprc;
	}

	public String getMnftwon(){
		return this.mnftwon;
	}

	public String getSpec(){
		return this.spec;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getUseclsf(){
		return this.useclsf;
	}

	public String getUseyn(){
		return this.useyn;
	}

	public String getSQL(){
		 return "{ call SP_SL_A_BNSITEM( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_BNSITEMDM dm = (SL_A_BNSITEMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.bns_itemcd);
		cstmt.setString(6, dm.bns_itemnm);
		cstmt.setLong(7, dm.uprc);
		cstmt.setString(8, dm.mnftwon);
		cstmt.setString(9, dm.spec);
		cstmt.setString(10, dm.remk);
		cstmt.setString(11, dm.useclsf);
		cstmt.setString(12, dm.useyn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SL_A_BNSITEMDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String bns_itemcd = req.getParameter("bns_itemcd");
if( bns_itemcd == null){
	System.out.println(this.toString+" : bns_itemcd is null" );
}else{
	System.out.println(this.toString+" : bns_itemcd is "+bns_itemcd );
}
String bns_itemnm = req.getParameter("bns_itemnm");
if( bns_itemnm == null){
	System.out.println(this.toString+" : bns_itemnm is null" );
}else{
	System.out.println(this.toString+" : bns_itemnm is "+bns_itemnm );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String mnftwon = req.getParameter("mnftwon");
if( mnftwon == null){
	System.out.println(this.toString+" : mnftwon is null" );
}else{
	System.out.println(this.toString+" : mnftwon is "+mnftwon );
}
String spec = req.getParameter("spec");
if( spec == null){
	System.out.println(this.toString+" : spec is null" );
}else{
	System.out.println(this.toString+" : spec is "+spec );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String useclsf = req.getParameter("useclsf");
if( useclsf == null){
	System.out.println(this.toString+" : useclsf is null" );
}else{
	System.out.println(this.toString+" : useclsf is "+useclsf );
}
String useyn = req.getParameter("useyn");
if( useyn == null){
	System.out.println(this.toString+" : useyn is null" );
}else{
	System.out.println(this.toString+" : useyn is "+useyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));
String bns_itemnm = Util.checkString(req.getParameter("bns_itemnm"));
String uprc = Util.checkString(req.getParameter("uprc"));
String mnftwon = Util.checkString(req.getParameter("mnftwon"));
String spec = Util.checkString(req.getParameter("spec"));
String remk = Util.checkString(req.getParameter("remk"));
String useclsf = Util.checkString(req.getParameter("useclsf"));
String useyn = Util.checkString(req.getParameter("useyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
String bns_itemnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemnm")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String mnftwon = Util.Uni2Ksc(Util.checkString(req.getParameter("mnftwon")));
String spec = Util.Uni2Ksc(Util.checkString(req.getParameter("spec")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String useclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("useclsf")));
String useyn = Util.Uni2Ksc(Util.checkString(req.getParameter("useyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setIncmgpers(incmgpers);
dm.setBns_itemcd(bns_itemcd);
dm.setBns_itemnm(bns_itemnm);
dm.setUprc(uprc);
dm.setMnftwon(mnftwon);
dm.setSpec(spec);
dm.setRemk(remk);
dm.setUseclsf(useclsf);
dm.setUseyn(useyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 25 14:20:55 KST 2007 */