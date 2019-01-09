/***************************************************************************************************
* ���ϸ� : PS_D_INFOEXGDM.java
* ��� : ���Ǳ� �Խ��� ����
* �ۼ����� : 2004-02-23
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.share.ds.*;
import chosun.ciis.ps.pbs.share.rec.*;

/**
 * ���Ǳ� �Խ��� ����
 *
 */


public class PS_D_INFOEXGDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clsf;
	public long seq;
	public String cmpycd;
	public String incmgpers;
	public String jobcd;

	public PS_D_INFOEXGDM(){}
	public PS_D_INFOEXGDM(String clsf, long seq, String cmpycd, String incmgpers, String jobcd){
		this.clsf = clsf;
		this.seq = seq;
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.jobcd = jobcd;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setJobcd(String jobcd){
		this.jobcd = jobcd;
	}

	public String getClsf(){
		return this.clsf;
	}

	public long getSeq(){
		return this.seq;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getJobcd(){
		return this.jobcd;
	}

	public String getSQL(){
		 return "{ call SP_PS_D_INFOEXG( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_D_INFOEXGDM dm = (PS_D_INFOEXGDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clsf);
		cstmt.setLong(4, dm.seq);
		cstmt.setString(5, dm.cmpycd);
		cstmt.setString(6, dm.incmgpers);
		cstmt.setString(7, dm.jobcd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.share.ds.PS_D_INFOEXGDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String jobcd = req.getParameter("jobcd");
if( jobcd == null){
	System.out.println(this.toString+" : jobcd is null" );
}else{
	System.out.println(this.toString+" : jobcd is "+jobcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String clsf = Util.checkString(req.getParameter("clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String jobcd = Util.checkString(req.getParameter("jobcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String jobcd = Util.Uni2Ksc(Util.checkString(req.getParameter("jobcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setClsf(clsf);
dm.setSeq(seq);
dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setJobcd(jobcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 24 20:38:34 KST 2004 */