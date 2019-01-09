/***************************************************************************************************
* ���ϸ�   : SP_CO_A_WEEKCHOSUNCLOS.java
* ���     : �߼�-��޺񸶰� ����/�������
* �ۼ����� : 2008-07-29
* �ۼ���   : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������   :
* �������� :
* ���     :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * �߼�-��޺񸶰� ����/�������
 *
 */

public class CO_A_WEEKCHOSUNCLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String closyymm;
	public String bas_frdt;
	public String bas_todt;
	public String medicd;
	public String wrkuser;

	public CO_A_WEEKCHOSUNCLOSDM(){}
	public CO_A_WEEKCHOSUNCLOSDM(String accflag, String closyymm, String bas_frdt, String bas_todt, String medicd, String wrkuser){
		this.accflag = accflag;
		this.closyymm = closyymm;
		this.bas_frdt = bas_frdt;
		this.bas_todt = bas_todt;
		this.medicd = medicd;
		this.wrkuser = wrkuser;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setClosyymm(String closyymm){
		this.closyymm = closyymm;
	}

	public void setBas_frdt(String bas_frdt){
		this.bas_frdt = bas_frdt;
	}

	public void setBas_todt(String bas_todt){
		this.bas_todt = bas_todt;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setWrkuser(String wrkuser){
		this.wrkuser = wrkuser;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getClosyymm(){
		return this.closyymm;
	}

	public String getBas_frdt(){
		return this.bas_frdt;
	}

	public String getBas_todt(){
		return this.bas_todt;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getWrkuser(){
		return this.wrkuser;
	}

	public String getSQL(){
		 return "{ call SP_CO_A_WEEKCHOSUNCLOS( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_A_WEEKCHOSUNCLOSDM dm = (CO_A_WEEKCHOSUNCLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.closyymm);
		cstmt.setString(5, dm.bas_frdt);
		cstmt.setString(6, dm.bas_todt);
		cstmt.setString(7, dm.medicd);
		cstmt.setString(8, dm.wrkuser);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.CO_A_WEEKCHOSUNCLOSDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String closyymm = req.getParameter("closyymm");
if( closyymm == null){
	System.out.println(this.toString+" : closyymm is null" );
}else{
	System.out.println(this.toString+" : closyymm is "+closyymm );
}
String bas_frdt = req.getParameter("bas_frdt");
if( bas_frdt == null){
	System.out.println(this.toString+" : bas_frdt is null" );
}else{
	System.out.println(this.toString+" : bas_frdt is "+bas_frdt );
}
String bas_todt = req.getParameter("bas_todt");
if( bas_todt == null){
	System.out.println(this.toString+" : bas_todt is null" );
}else{
	System.out.println(this.toString+" : bas_todt is "+bas_todt );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String wrkuser = req.getParameter("wrkuser");
if( wrkuser == null){
	System.out.println(this.toString+" : wrkuser is null" );
}else{
	System.out.println(this.toString+" : wrkuser is "+wrkuser );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String accflag = Util.checkString(req.getParameter("accflag"));
String closyymm = Util.checkString(req.getParameter("closyymm"));
String bas_frdt = Util.checkString(req.getParameter("bas_frdt"));
String bas_todt = Util.checkString(req.getParameter("bas_todt"));
String medicd = Util.checkString(req.getParameter("medicd"));
String wrkuser = Util.checkString(req.getParameter("wrkuser"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String closyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("closyymm")));
String bas_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("bas_frdt")));
String bas_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("bas_todt")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String wrkuser = Util.Uni2Ksc(Util.checkString(req.getParameter("wrkuser")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setAccflag(accflag);
dm.setClosyymm(closyymm);
dm.setBas_frdt(bas_frdt);
dm.setBas_todt(bas_todt);
dm.setMedicd(medicd);
dm.setWrkuser(wrkuser);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 31 14:00:22 KST 2008 */