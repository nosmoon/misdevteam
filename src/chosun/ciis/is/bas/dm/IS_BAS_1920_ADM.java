/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.is.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.ds.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_1920_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String year;
	public String mode;
	public String trgt_mm;
	public String chrg_pers;
	public String sale_clsf;
	public String dept_cd;
	public String sub_dept_cd;
	public String trgt_sale_amt;
	public String remk;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_BAS_1920_ADM(){}
	public IS_BAS_1920_ADM(String cmpy_cd, String year, String mode, String trgt_mm, String chrg_pers, String sale_clsf, String dept_cd, String sub_dept_cd, String trgt_sale_amt, String remk, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.year = year;
		this.mode = mode;
		this.trgt_mm = trgt_mm;
		this.chrg_pers = chrg_pers;
		this.sale_clsf = sale_clsf;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.trgt_sale_amt = trgt_sale_amt;
		this.remk = remk;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYear(String year){
		this.year = year;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setTrgt_mm(String trgt_mm){
		this.trgt_mm = trgt_mm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setTrgt_sale_amt(String trgt_sale_amt){
		this.trgt_sale_amt = trgt_sale_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYear(){
		return this.year;
	}

	public String getMode(){
		return this.mode;
	}

	public String getTrgt_mm(){
		return this.trgt_mm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getTrgt_sale_amt(){
		return this.trgt_sale_amt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BAS_1920_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BAS_1920_ADM dm = (IS_BAS_1920_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.year);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.trgt_mm);
		cstmt.setString(7, dm.chrg_pers);
		cstmt.setString(8, dm.sale_clsf);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.sub_dept_cd);
		cstmt.setString(11, dm.trgt_sale_amt);
		cstmt.setString(12, dm.remk);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bas.ds.IS_BAS_1920_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("year = [" + getYear() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("trgt_mm = [" + getTrgt_mm() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("sale_clsf = [" + getSale_clsf() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("trgt_sale_amt = [" + getTrgt_sale_amt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String year = req.getParameter("year");
if( year == null){
	System.out.println(this.toString+" : year is null" );
}else{
	System.out.println(this.toString+" : year is "+year );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String trgt_mm = req.getParameter("trgt_mm");
if( trgt_mm == null){
	System.out.println(this.toString+" : trgt_mm is null" );
}else{
	System.out.println(this.toString+" : trgt_mm is "+trgt_mm );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String sale_clsf = req.getParameter("sale_clsf");
if( sale_clsf == null){
	System.out.println(this.toString+" : sale_clsf is null" );
}else{
	System.out.println(this.toString+" : sale_clsf is "+sale_clsf );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String trgt_sale_amt = req.getParameter("trgt_sale_amt");
if( trgt_sale_amt == null){
	System.out.println(this.toString+" : trgt_sale_amt is null" );
}else{
	System.out.println(this.toString+" : trgt_sale_amt is "+trgt_sale_amt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String year = Util.checkString(req.getParameter("year"));
String mode = Util.checkString(req.getParameter("mode"));
String trgt_mm = Util.checkString(req.getParameter("trgt_mm"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String trgt_sale_amt = Util.checkString(req.getParameter("trgt_sale_amt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String year = Util.Uni2Ksc(Util.checkString(req.getParameter("year")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String trgt_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_mm")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_clsf")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String trgt_sale_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_sale_amt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setYear(year);
dm.setMode(mode);
dm.setTrgt_mm(trgt_mm);
dm.setChrg_pers(chrg_pers);
dm.setSale_clsf(sale_clsf);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setTrgt_sale_amt(trgt_sale_amt);
dm.setRemk(remk);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 24 18:35:17 KST 2012 */