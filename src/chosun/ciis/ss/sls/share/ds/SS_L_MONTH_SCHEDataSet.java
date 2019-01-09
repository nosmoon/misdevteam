/***************************************************************************************************
* 파일명 : SS_L_MONTH_SCHEDataSet.java
* 기능 : 정보공유-메인페이지-월별 일정 목록을 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-메인페이지-월별 일정 목록을 위한 DataSet
 */

public class SS_L_MONTH_SCHEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList day28schecur = new ArrayList();
	public ArrayList day23schecur = new ArrayList();
	public ArrayList day30schecur = new ArrayList();
	public ArrayList day26schecur = new ArrayList();
	public ArrayList day21schecur = new ArrayList();
	public ArrayList day17schecur = new ArrayList();
	public ArrayList day12schecur = new ArrayList();
	public ArrayList day29schecur = new ArrayList();
	public ArrayList day24schecur = new ArrayList();
	public ArrayList day06schecur = new ArrayList();
	public ArrayList day01schecur = new ArrayList();
	public ArrayList day15schecur = new ArrayList();
	public ArrayList day10schecur = new ArrayList();
	public ArrayList day18schecur = new ArrayList();
	public ArrayList day09schecur = new ArrayList();
	public ArrayList day04schecur = new ArrayList();
	public ArrayList day13schecur = new ArrayList();
	public ArrayList day02schecur = new ArrayList();
	public ArrayList day31schecur = new ArrayList();
	public ArrayList day27schecur = new ArrayList();
	public ArrayList day22schecur = new ArrayList();
	public ArrayList day25schecur = new ArrayList();
	public ArrayList day20schecur = new ArrayList();
	public ArrayList day16schecur = new ArrayList();
	public ArrayList day11schecur = new ArrayList();
	public ArrayList day07schecur = new ArrayList();
	public ArrayList day19schecur = new ArrayList();
	public ArrayList day05schecur = new ArrayList();
	public ArrayList day14schecur = new ArrayList();
	public ArrayList day03schecur = new ArrayList();
	public ArrayList day08schecur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_MONTH_SCHEDataSet(){}
	public SS_L_MONTH_SCHEDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SS_L_MONTH_SCHEDAY01SCHECURRecord rec = new SS_L_MONTH_SCHEDAY01SCHECURRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset0.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset0.getString("schemangunitcd_nm"));
			this.day01schecur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			SS_L_MONTH_SCHEDAY02SCHECURRecord rec = new SS_L_MONTH_SCHEDAY02SCHECURRecord();
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.frdt = Util.checkString(rset1.getString("frdt"));
			rec.todt = Util.checkString(rset1.getString("todt"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset1.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset1.getString("schemangunitcd_nm"));
			this.day02schecur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			SS_L_MONTH_SCHEDAY03SCHECURRecord rec = new SS_L_MONTH_SCHEDAY03SCHECURRecord();
			rec.seq = Util.checkString(rset2.getString("seq"));
			rec.frdt = Util.checkString(rset2.getString("frdt"));
			rec.todt = Util.checkString(rset2.getString("todt"));
			rec.remk = Util.checkString(rset2.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset2.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset2.getString("schemangunitcd_nm"));
			this.day03schecur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			SS_L_MONTH_SCHEDAY04SCHECURRecord rec = new SS_L_MONTH_SCHEDAY04SCHECURRecord();
			rec.seq = Util.checkString(rset3.getString("seq"));
			rec.frdt = Util.checkString(rset3.getString("frdt"));
			rec.todt = Util.checkString(rset3.getString("todt"));
			rec.remk = Util.checkString(rset3.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset3.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset3.getString("schemangunitcd_nm"));
			this.day04schecur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			SS_L_MONTH_SCHEDAY05SCHECURRecord rec = new SS_L_MONTH_SCHEDAY05SCHECURRecord();
			rec.seq = Util.checkString(rset4.getString("seq"));
			rec.frdt = Util.checkString(rset4.getString("frdt"));
			rec.todt = Util.checkString(rset4.getString("todt"));
			rec.remk = Util.checkString(rset4.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset4.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset4.getString("schemangunitcd_nm"));
			this.day05schecur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			SS_L_MONTH_SCHEDAY06SCHECURRecord rec = new SS_L_MONTH_SCHEDAY06SCHECURRecord();
			rec.seq = Util.checkString(rset5.getString("seq"));
			rec.frdt = Util.checkString(rset5.getString("frdt"));
			rec.todt = Util.checkString(rset5.getString("todt"));
			rec.remk = Util.checkString(rset5.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset5.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset5.getString("schemangunitcd_nm"));
			this.day06schecur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(12);
		while(rset6.next()){
			SS_L_MONTH_SCHEDAY07SCHECURRecord rec = new SS_L_MONTH_SCHEDAY07SCHECURRecord();
			rec.seq = Util.checkString(rset6.getString("seq"));
			rec.frdt = Util.checkString(rset6.getString("frdt"));
			rec.todt = Util.checkString(rset6.getString("todt"));
			rec.remk = Util.checkString(rset6.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset6.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset6.getString("schemangunitcd_nm"));
			this.day07schecur.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(13);
		while(rset7.next()){
			SS_L_MONTH_SCHEDAY08SCHECURRecord rec = new SS_L_MONTH_SCHEDAY08SCHECURRecord();
			rec.seq = Util.checkString(rset7.getString("seq"));
			rec.frdt = Util.checkString(rset7.getString("frdt"));
			rec.todt = Util.checkString(rset7.getString("todt"));
			rec.remk = Util.checkString(rset7.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset7.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset7.getString("schemangunitcd_nm"));
			this.day08schecur.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(14);
		while(rset8.next()){
			SS_L_MONTH_SCHEDAY09SCHECURRecord rec = new SS_L_MONTH_SCHEDAY09SCHECURRecord();
			rec.seq = Util.checkString(rset8.getString("seq"));
			rec.frdt = Util.checkString(rset8.getString("frdt"));
			rec.todt = Util.checkString(rset8.getString("todt"));
			rec.remk = Util.checkString(rset8.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset8.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset8.getString("schemangunitcd_nm"));
			this.day09schecur.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(15);
		while(rset9.next()){
			SS_L_MONTH_SCHEDAY10SCHECURRecord rec = new SS_L_MONTH_SCHEDAY10SCHECURRecord();
			rec.seq = Util.checkString(rset9.getString("seq"));
			rec.frdt = Util.checkString(rset9.getString("frdt"));
			rec.todt = Util.checkString(rset9.getString("todt"));
			rec.remk = Util.checkString(rset9.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset9.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset9.getString("schemangunitcd_nm"));
			this.day10schecur.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(16);
		while(rset10.next()){
			SS_L_MONTH_SCHEDAY11SCHECURRecord rec = new SS_L_MONTH_SCHEDAY11SCHECURRecord();
			rec.seq = Util.checkString(rset10.getString("seq"));
			rec.frdt = Util.checkString(rset10.getString("frdt"));
			rec.todt = Util.checkString(rset10.getString("todt"));
			rec.remk = Util.checkString(rset10.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset10.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset10.getString("schemangunitcd_nm"));
			this.day11schecur.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(17);
		while(rset11.next()){
			SS_L_MONTH_SCHEDAY12SCHECURRecord rec = new SS_L_MONTH_SCHEDAY12SCHECURRecord();
			rec.seq = Util.checkString(rset11.getString("seq"));
			rec.frdt = Util.checkString(rset11.getString("frdt"));
			rec.todt = Util.checkString(rset11.getString("todt"));
			rec.remk = Util.checkString(rset11.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset11.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset11.getString("schemangunitcd_nm"));
			this.day12schecur.add(rec);
		}
		ResultSet rset12 = (ResultSet) cstmt.getObject(18);
		while(rset12.next()){
			SS_L_MONTH_SCHEDAY13SCHECURRecord rec = new SS_L_MONTH_SCHEDAY13SCHECURRecord();
			rec.seq = Util.checkString(rset12.getString("seq"));
			rec.frdt = Util.checkString(rset12.getString("frdt"));
			rec.todt = Util.checkString(rset12.getString("todt"));
			rec.remk = Util.checkString(rset12.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset12.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset12.getString("schemangunitcd_nm"));
			this.day13schecur.add(rec);
		}
		ResultSet rset13 = (ResultSet) cstmt.getObject(19);
		while(rset13.next()){
			SS_L_MONTH_SCHEDAY14SCHECURRecord rec = new SS_L_MONTH_SCHEDAY14SCHECURRecord();
			rec.seq = Util.checkString(rset13.getString("seq"));
			rec.frdt = Util.checkString(rset13.getString("frdt"));
			rec.todt = Util.checkString(rset13.getString("todt"));
			rec.remk = Util.checkString(rset13.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset13.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset13.getString("schemangunitcd_nm"));
			this.day14schecur.add(rec);
		}
		ResultSet rset14 = (ResultSet) cstmt.getObject(20);
		while(rset14.next()){
			SS_L_MONTH_SCHEDAY15SCHECURRecord rec = new SS_L_MONTH_SCHEDAY15SCHECURRecord();
			rec.seq = Util.checkString(rset14.getString("seq"));
			rec.frdt = Util.checkString(rset14.getString("frdt"));
			rec.todt = Util.checkString(rset14.getString("todt"));
			rec.remk = Util.checkString(rset14.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset14.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset14.getString("schemangunitcd_nm"));
			this.day15schecur.add(rec);
		}
		ResultSet rset15 = (ResultSet) cstmt.getObject(21);
		while(rset15.next()){
			SS_L_MONTH_SCHEDAY16SCHECURRecord rec = new SS_L_MONTH_SCHEDAY16SCHECURRecord();
			rec.seq = Util.checkString(rset15.getString("seq"));
			rec.frdt = Util.checkString(rset15.getString("frdt"));
			rec.todt = Util.checkString(rset15.getString("todt"));
			rec.remk = Util.checkString(rset15.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset15.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset15.getString("schemangunitcd_nm"));
			this.day16schecur.add(rec);
		}
		ResultSet rset16 = (ResultSet) cstmt.getObject(22);
		while(rset16.next()){
			SS_L_MONTH_SCHEDAY17SCHECURRecord rec = new SS_L_MONTH_SCHEDAY17SCHECURRecord();
			rec.seq = Util.checkString(rset16.getString("seq"));
			rec.frdt = Util.checkString(rset16.getString("frdt"));
			rec.todt = Util.checkString(rset16.getString("todt"));
			rec.remk = Util.checkString(rset16.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset16.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset16.getString("schemangunitcd_nm"));
			this.day17schecur.add(rec);
		}
		ResultSet rset17 = (ResultSet) cstmt.getObject(23);
		while(rset17.next()){
			SS_L_MONTH_SCHEDAY18SCHECURRecord rec = new SS_L_MONTH_SCHEDAY18SCHECURRecord();
			rec.seq = Util.checkString(rset17.getString("seq"));
			rec.frdt = Util.checkString(rset17.getString("frdt"));
			rec.todt = Util.checkString(rset17.getString("todt"));
			rec.remk = Util.checkString(rset17.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset17.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset17.getString("schemangunitcd_nm"));
			this.day18schecur.add(rec);
		}
		ResultSet rset18 = (ResultSet) cstmt.getObject(24);
		while(rset18.next()){
			SS_L_MONTH_SCHEDAY19SCHECURRecord rec = new SS_L_MONTH_SCHEDAY19SCHECURRecord();
			rec.seq = Util.checkString(rset18.getString("seq"));
			rec.frdt = Util.checkString(rset18.getString("frdt"));
			rec.todt = Util.checkString(rset18.getString("todt"));
			rec.remk = Util.checkString(rset18.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset18.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset18.getString("schemangunitcd_nm"));
			this.day19schecur.add(rec);
		}
		ResultSet rset19 = (ResultSet) cstmt.getObject(25);
		while(rset19.next()){
			SS_L_MONTH_SCHEDAY20SCHECURRecord rec = new SS_L_MONTH_SCHEDAY20SCHECURRecord();
			rec.seq = Util.checkString(rset19.getString("seq"));
			rec.frdt = Util.checkString(rset19.getString("frdt"));
			rec.todt = Util.checkString(rset19.getString("todt"));
			rec.remk = Util.checkString(rset19.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset19.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset19.getString("schemangunitcd_nm"));
			this.day20schecur.add(rec);
		}
		ResultSet rset20 = (ResultSet) cstmt.getObject(26);
		while(rset20.next()){
			SS_L_MONTH_SCHEDAY21SCHECURRecord rec = new SS_L_MONTH_SCHEDAY21SCHECURRecord();
			rec.seq = Util.checkString(rset20.getString("seq"));
			rec.frdt = Util.checkString(rset20.getString("frdt"));
			rec.todt = Util.checkString(rset20.getString("todt"));
			rec.remk = Util.checkString(rset20.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset20.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset20.getString("schemangunitcd_nm"));
			this.day21schecur.add(rec);
		}
		ResultSet rset21 = (ResultSet) cstmt.getObject(27);
		while(rset21.next()){
			SS_L_MONTH_SCHEDAY22SCHECURRecord rec = new SS_L_MONTH_SCHEDAY22SCHECURRecord();
			rec.seq = Util.checkString(rset21.getString("seq"));
			rec.frdt = Util.checkString(rset21.getString("frdt"));
			rec.todt = Util.checkString(rset21.getString("todt"));
			rec.remk = Util.checkString(rset21.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset21.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset21.getString("schemangunitcd_nm"));
			this.day22schecur.add(rec);
		}
		ResultSet rset22 = (ResultSet) cstmt.getObject(28);
		while(rset22.next()){
			SS_L_MONTH_SCHEDAY23SCHECURRecord rec = new SS_L_MONTH_SCHEDAY23SCHECURRecord();
			rec.seq = Util.checkString(rset22.getString("seq"));
			rec.frdt = Util.checkString(rset22.getString("frdt"));
			rec.todt = Util.checkString(rset22.getString("todt"));
			rec.remk = Util.checkString(rset22.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset22.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset22.getString("schemangunitcd_nm"));
			this.day23schecur.add(rec);
		}
		ResultSet rset23 = (ResultSet) cstmt.getObject(29);
		while(rset23.next()){
			SS_L_MONTH_SCHEDAY24SCHECURRecord rec = new SS_L_MONTH_SCHEDAY24SCHECURRecord();
			rec.seq = Util.checkString(rset23.getString("seq"));
			rec.frdt = Util.checkString(rset23.getString("frdt"));
			rec.todt = Util.checkString(rset23.getString("todt"));
			rec.remk = Util.checkString(rset23.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset23.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset23.getString("schemangunitcd_nm"));
			this.day24schecur.add(rec);
		}
		ResultSet rset24 = (ResultSet) cstmt.getObject(30);
		while(rset24.next()){
			SS_L_MONTH_SCHEDAY25SCHECURRecord rec = new SS_L_MONTH_SCHEDAY25SCHECURRecord();
			rec.seq = Util.checkString(rset24.getString("seq"));
			rec.frdt = Util.checkString(rset24.getString("frdt"));
			rec.todt = Util.checkString(rset24.getString("todt"));
			rec.remk = Util.checkString(rset24.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset24.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset24.getString("schemangunitcd_nm"));
			this.day25schecur.add(rec);
		}
		ResultSet rset25 = (ResultSet) cstmt.getObject(31);
		while(rset25.next()){
			SS_L_MONTH_SCHEDAY26SCHECURRecord rec = new SS_L_MONTH_SCHEDAY26SCHECURRecord();
			rec.seq = Util.checkString(rset25.getString("seq"));
			rec.frdt = Util.checkString(rset25.getString("frdt"));
			rec.todt = Util.checkString(rset25.getString("todt"));
			rec.remk = Util.checkString(rset25.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset25.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset25.getString("schemangunitcd_nm"));
			this.day26schecur.add(rec);
		}
		ResultSet rset26 = (ResultSet) cstmt.getObject(32);
		while(rset26.next()){
			SS_L_MONTH_SCHEDAY27SCHECURRecord rec = new SS_L_MONTH_SCHEDAY27SCHECURRecord();
			rec.seq = Util.checkString(rset26.getString("seq"));
			rec.frdt = Util.checkString(rset26.getString("frdt"));
			rec.todt = Util.checkString(rset26.getString("todt"));
			rec.remk = Util.checkString(rset26.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset26.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset26.getString("schemangunitcd_nm"));
			this.day27schecur.add(rec);
		}
		ResultSet rset27 = (ResultSet) cstmt.getObject(33);
		while(rset27.next()){
			SS_L_MONTH_SCHEDAY28SCHECURRecord rec = new SS_L_MONTH_SCHEDAY28SCHECURRecord();
			rec.seq = Util.checkString(rset27.getString("seq"));
			rec.frdt = Util.checkString(rset27.getString("frdt"));
			rec.todt = Util.checkString(rset27.getString("todt"));
			rec.remk = Util.checkString(rset27.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset27.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset27.getString("schemangunitcd_nm"));
			this.day28schecur.add(rec);
		}
		ResultSet rset28 = (ResultSet) cstmt.getObject(34);
		while(rset28.next()){
			SS_L_MONTH_SCHEDAY29SCHECURRecord rec = new SS_L_MONTH_SCHEDAY29SCHECURRecord();
			rec.seq = Util.checkString(rset28.getString("seq"));
			rec.frdt = Util.checkString(rset28.getString("frdt"));
			rec.todt = Util.checkString(rset28.getString("todt"));
			rec.remk = Util.checkString(rset28.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset28.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset28.getString("schemangunitcd_nm"));
			this.day29schecur.add(rec);
		}
		ResultSet rset29 = (ResultSet) cstmt.getObject(35);
		while(rset29.next()){
			SS_L_MONTH_SCHEDAY30SCHECURRecord rec = new SS_L_MONTH_SCHEDAY30SCHECURRecord();
			rec.seq = Util.checkString(rset29.getString("seq"));
			rec.frdt = Util.checkString(rset29.getString("frdt"));
			rec.todt = Util.checkString(rset29.getString("todt"));
			rec.remk = Util.checkString(rset29.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset29.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset29.getString("schemangunitcd_nm"));
			this.day30schecur.add(rec);
		}
		ResultSet rset30 = (ResultSet) cstmt.getObject(36);
		while(rset30.next()){
			SS_L_MONTH_SCHEDAY31SCHECURRecord rec = new SS_L_MONTH_SCHEDAY31SCHECURRecord();
			rec.seq = Util.checkString(rset30.getString("seq"));
			rec.frdt = Util.checkString(rset30.getString("frdt"));
			rec.todt = Util.checkString(rset30.getString("todt"));
			rec.remk = Util.checkString(rset30.getString("remk"));
			rec.schemangunitcd = Util.checkString(rset30.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset30.getString("schemangunitcd_nm"));
			this.day31schecur.add(rec);
		}
	}

	public String day01schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day01schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY01SCHECURRecord rec = (SS_L_MONTH_SCHEDAY01SCHECURRecord)day01schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day02schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day02schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY02SCHECURRecord rec = (SS_L_MONTH_SCHEDAY02SCHECURRecord)day02schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day03schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day03schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY03SCHECURRecord rec = (SS_L_MONTH_SCHEDAY03SCHECURRecord)day03schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day04schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day04schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY04SCHECURRecord rec = (SS_L_MONTH_SCHEDAY04SCHECURRecord)day04schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day05schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day05schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY05SCHECURRecord rec = (SS_L_MONTH_SCHEDAY05SCHECURRecord)day05schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day06schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day06schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY06SCHECURRecord rec = (SS_L_MONTH_SCHEDAY06SCHECURRecord)day06schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day07schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day07schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY07SCHECURRecord rec = (SS_L_MONTH_SCHEDAY07SCHECURRecord)day07schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day08schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day08schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY08SCHECURRecord rec = (SS_L_MONTH_SCHEDAY08SCHECURRecord)day08schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day09schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day09schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY09SCHECURRecord rec = (SS_L_MONTH_SCHEDAY09SCHECURRecord)day09schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day10schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day10schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY10SCHECURRecord rec = (SS_L_MONTH_SCHEDAY10SCHECURRecord)day10schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day11schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day11schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY11SCHECURRecord rec = (SS_L_MONTH_SCHEDAY11SCHECURRecord)day11schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day12schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day12schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY12SCHECURRecord rec = (SS_L_MONTH_SCHEDAY12SCHECURRecord)day12schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day13schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day13schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY13SCHECURRecord rec = (SS_L_MONTH_SCHEDAY13SCHECURRecord)day13schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day14schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day14schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY14SCHECURRecord rec = (SS_L_MONTH_SCHEDAY14SCHECURRecord)day14schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day15schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day15schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY15SCHECURRecord rec = (SS_L_MONTH_SCHEDAY15SCHECURRecord)day15schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day16schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day16schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY16SCHECURRecord rec = (SS_L_MONTH_SCHEDAY16SCHECURRecord)day16schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day17schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day17schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY17SCHECURRecord rec = (SS_L_MONTH_SCHEDAY17SCHECURRecord)day17schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day18schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day18schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY18SCHECURRecord rec = (SS_L_MONTH_SCHEDAY18SCHECURRecord)day18schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day19schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day19schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY19SCHECURRecord rec = (SS_L_MONTH_SCHEDAY19SCHECURRecord)day19schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day20schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day20schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY20SCHECURRecord rec = (SS_L_MONTH_SCHEDAY20SCHECURRecord)day20schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day21schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day21schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY21SCHECURRecord rec = (SS_L_MONTH_SCHEDAY21SCHECURRecord)day21schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day22schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day22schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY22SCHECURRecord rec = (SS_L_MONTH_SCHEDAY22SCHECURRecord)day22schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day23schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day23schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY23SCHECURRecord rec = (SS_L_MONTH_SCHEDAY23SCHECURRecord)day23schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day24schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day24schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY24SCHECURRecord rec = (SS_L_MONTH_SCHEDAY24SCHECURRecord)day24schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day25schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day25schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY25SCHECURRecord rec = (SS_L_MONTH_SCHEDAY25SCHECURRecord)day25schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day26schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day26schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY26SCHECURRecord rec = (SS_L_MONTH_SCHEDAY26SCHECURRecord)day26schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day27schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day27schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY27SCHECURRecord rec = (SS_L_MONTH_SCHEDAY27SCHECURRecord)day27schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day28schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day28schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY28SCHECURRecord rec = (SS_L_MONTH_SCHEDAY28SCHECURRecord)day28schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day29schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day29schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY29SCHECURRecord rec = (SS_L_MONTH_SCHEDAY29SCHECURRecord)day29schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day30schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day30schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY30SCHECURRecord rec = (SS_L_MONTH_SCHEDAY30SCHECURRecord)day30schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day31schecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day31schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY31SCHECURRecord rec = (SS_L_MONTH_SCHEDAY31SCHECURRecord)day31schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String day01schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day01schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY01SCHECURRecord rec = (SS_L_MONTH_SCHEDAY01SCHECURRecord)day01schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day02schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day02schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY02SCHECURRecord rec = (SS_L_MONTH_SCHEDAY02SCHECURRecord)day02schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day03schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day03schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY03SCHECURRecord rec = (SS_L_MONTH_SCHEDAY03SCHECURRecord)day03schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day04schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day04schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY04SCHECURRecord rec = (SS_L_MONTH_SCHEDAY04SCHECURRecord)day04schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day05schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day05schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY05SCHECURRecord rec = (SS_L_MONTH_SCHEDAY05SCHECURRecord)day05schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day06schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day06schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY06SCHECURRecord rec = (SS_L_MONTH_SCHEDAY06SCHECURRecord)day06schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day07schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day07schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY07SCHECURRecord rec = (SS_L_MONTH_SCHEDAY07SCHECURRecord)day07schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day08schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day08schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY08SCHECURRecord rec = (SS_L_MONTH_SCHEDAY08SCHECURRecord)day08schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day09schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day09schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY09SCHECURRecord rec = (SS_L_MONTH_SCHEDAY09SCHECURRecord)day09schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day10schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day10schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY10SCHECURRecord rec = (SS_L_MONTH_SCHEDAY10SCHECURRecord)day10schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day11schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day11schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY11SCHECURRecord rec = (SS_L_MONTH_SCHEDAY11SCHECURRecord)day11schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day12schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day12schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY12SCHECURRecord rec = (SS_L_MONTH_SCHEDAY12SCHECURRecord)day12schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day13schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day13schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY13SCHECURRecord rec = (SS_L_MONTH_SCHEDAY13SCHECURRecord)day13schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day14schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day14schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY14SCHECURRecord rec = (SS_L_MONTH_SCHEDAY14SCHECURRecord)day14schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day15schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day15schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY15SCHECURRecord rec = (SS_L_MONTH_SCHEDAY15SCHECURRecord)day15schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day16schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day16schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY16SCHECURRecord rec = (SS_L_MONTH_SCHEDAY16SCHECURRecord)day16schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day17schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day17schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY17SCHECURRecord rec = (SS_L_MONTH_SCHEDAY17SCHECURRecord)day17schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day18schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day18schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY18SCHECURRecord rec = (SS_L_MONTH_SCHEDAY18SCHECURRecord)day18schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day19schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day19schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY19SCHECURRecord rec = (SS_L_MONTH_SCHEDAY19SCHECURRecord)day19schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day20schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day20schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY20SCHECURRecord rec = (SS_L_MONTH_SCHEDAY20SCHECURRecord)day20schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day21schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day21schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY21SCHECURRecord rec = (SS_L_MONTH_SCHEDAY21SCHECURRecord)day21schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day22schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day22schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY22SCHECURRecord rec = (SS_L_MONTH_SCHEDAY22SCHECURRecord)day22schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day23schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day23schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY23SCHECURRecord rec = (SS_L_MONTH_SCHEDAY23SCHECURRecord)day23schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day24schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day24schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY24SCHECURRecord rec = (SS_L_MONTH_SCHEDAY24SCHECURRecord)day24schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day25schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day25schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY25SCHECURRecord rec = (SS_L_MONTH_SCHEDAY25SCHECURRecord)day25schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day26schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day26schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY26SCHECURRecord rec = (SS_L_MONTH_SCHEDAY26SCHECURRecord)day26schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day27schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day27schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY27SCHECURRecord rec = (SS_L_MONTH_SCHEDAY27SCHECURRecord)day27schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day28schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day28schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY28SCHECURRecord rec = (SS_L_MONTH_SCHEDAY28SCHECURRecord)day28schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day29schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day29schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY29SCHECURRecord rec = (SS_L_MONTH_SCHEDAY29SCHECURRecord)day29schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day30schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day30schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY30SCHECURRecord rec = (SS_L_MONTH_SCHEDAY30SCHECURRecord)day30schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day31schecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day31schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY31SCHECURRecord rec = (SS_L_MONTH_SCHEDAY31SCHECURRecord)day31schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day01schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day01schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY01SCHECURRecord rec = (SS_L_MONTH_SCHEDAY01SCHECURRecord)day01schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day02schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day02schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY02SCHECURRecord rec = (SS_L_MONTH_SCHEDAY02SCHECURRecord)day02schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day03schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day03schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY03SCHECURRecord rec = (SS_L_MONTH_SCHEDAY03SCHECURRecord)day03schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day04schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day04schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY04SCHECURRecord rec = (SS_L_MONTH_SCHEDAY04SCHECURRecord)day04schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day05schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day05schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY05SCHECURRecord rec = (SS_L_MONTH_SCHEDAY05SCHECURRecord)day05schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day06schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day06schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY06SCHECURRecord rec = (SS_L_MONTH_SCHEDAY06SCHECURRecord)day06schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day07schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day07schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY07SCHECURRecord rec = (SS_L_MONTH_SCHEDAY07SCHECURRecord)day07schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day08schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day08schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY08SCHECURRecord rec = (SS_L_MONTH_SCHEDAY08SCHECURRecord)day08schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day09schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day09schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY09SCHECURRecord rec = (SS_L_MONTH_SCHEDAY09SCHECURRecord)day09schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day10schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day10schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY10SCHECURRecord rec = (SS_L_MONTH_SCHEDAY10SCHECURRecord)day10schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day11schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day11schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY11SCHECURRecord rec = (SS_L_MONTH_SCHEDAY11SCHECURRecord)day11schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day12schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day12schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY12SCHECURRecord rec = (SS_L_MONTH_SCHEDAY12SCHECURRecord)day12schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day13schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day13schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY13SCHECURRecord rec = (SS_L_MONTH_SCHEDAY13SCHECURRecord)day13schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day14schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day14schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY14SCHECURRecord rec = (SS_L_MONTH_SCHEDAY14SCHECURRecord)day14schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day15schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day15schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY15SCHECURRecord rec = (SS_L_MONTH_SCHEDAY15SCHECURRecord)day15schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day16schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day16schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY16SCHECURRecord rec = (SS_L_MONTH_SCHEDAY16SCHECURRecord)day16schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day17schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day17schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY17SCHECURRecord rec = (SS_L_MONTH_SCHEDAY17SCHECURRecord)day17schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day18schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day18schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY18SCHECURRecord rec = (SS_L_MONTH_SCHEDAY18SCHECURRecord)day18schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day19schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day19schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY19SCHECURRecord rec = (SS_L_MONTH_SCHEDAY19SCHECURRecord)day19schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day20schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day20schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY20SCHECURRecord rec = (SS_L_MONTH_SCHEDAY20SCHECURRecord)day20schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day21schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day21schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY21SCHECURRecord rec = (SS_L_MONTH_SCHEDAY21SCHECURRecord)day21schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day22schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day22schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY22SCHECURRecord rec = (SS_L_MONTH_SCHEDAY22SCHECURRecord)day22schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day23schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day23schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY23SCHECURRecord rec = (SS_L_MONTH_SCHEDAY23SCHECURRecord)day23schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day24schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day24schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY24SCHECURRecord rec = (SS_L_MONTH_SCHEDAY24SCHECURRecord)day24schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day25schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day25schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY25SCHECURRecord rec = (SS_L_MONTH_SCHEDAY25SCHECURRecord)day25schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day26schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day26schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY26SCHECURRecord rec = (SS_L_MONTH_SCHEDAY26SCHECURRecord)day26schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day27schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day27schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY27SCHECURRecord rec = (SS_L_MONTH_SCHEDAY27SCHECURRecord)day27schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day28schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day28schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY28SCHECURRecord rec = (SS_L_MONTH_SCHEDAY28SCHECURRecord)day28schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day29schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day29schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY29SCHECURRecord rec = (SS_L_MONTH_SCHEDAY29SCHECURRecord)day29schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day30schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day30schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY30SCHECURRecord rec = (SS_L_MONTH_SCHEDAY30SCHECURRecord)day30schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String day31schecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = day31schecur.size();
		for(int i=0; i<size; i++){
			SS_L_MONTH_SCHEDAY31SCHECURRecord rec = (SS_L_MONTH_SCHEDAY31SCHECURRecord)day31schecur.get(i);
			
			
			String code = rec.seq;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("seq");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_MONTH_SCHEDataSet ds = (SS_L_MONTH_SCHEDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.day01schecur.size(); i++){
		SS_L_MONTH_SCHEDAY01SCHECURRecord day01schecurRec = (SS_L_MONTH_SCHEDAY01SCHECURRecord)ds.day01schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day02schecur.size(); i++){
		SS_L_MONTH_SCHEDAY02SCHECURRecord day02schecurRec = (SS_L_MONTH_SCHEDAY02SCHECURRecord)ds.day02schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day03schecur.size(); i++){
		SS_L_MONTH_SCHEDAY03SCHECURRecord day03schecurRec = (SS_L_MONTH_SCHEDAY03SCHECURRecord)ds.day03schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day04schecur.size(); i++){
		SS_L_MONTH_SCHEDAY04SCHECURRecord day04schecurRec = (SS_L_MONTH_SCHEDAY04SCHECURRecord)ds.day04schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day05schecur.size(); i++){
		SS_L_MONTH_SCHEDAY05SCHECURRecord day05schecurRec = (SS_L_MONTH_SCHEDAY05SCHECURRecord)ds.day05schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day06schecur.size(); i++){
		SS_L_MONTH_SCHEDAY06SCHECURRecord day06schecurRec = (SS_L_MONTH_SCHEDAY06SCHECURRecord)ds.day06schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day07schecur.size(); i++){
		SS_L_MONTH_SCHEDAY07SCHECURRecord day07schecurRec = (SS_L_MONTH_SCHEDAY07SCHECURRecord)ds.day07schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day08schecur.size(); i++){
		SS_L_MONTH_SCHEDAY08SCHECURRecord day08schecurRec = (SS_L_MONTH_SCHEDAY08SCHECURRecord)ds.day08schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day09schecur.size(); i++){
		SS_L_MONTH_SCHEDAY09SCHECURRecord day09schecurRec = (SS_L_MONTH_SCHEDAY09SCHECURRecord)ds.day09schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day10schecur.size(); i++){
		SS_L_MONTH_SCHEDAY10SCHECURRecord day10schecurRec = (SS_L_MONTH_SCHEDAY10SCHECURRecord)ds.day10schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day11schecur.size(); i++){
		SS_L_MONTH_SCHEDAY11SCHECURRecord day11schecurRec = (SS_L_MONTH_SCHEDAY11SCHECURRecord)ds.day11schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day12schecur.size(); i++){
		SS_L_MONTH_SCHEDAY12SCHECURRecord day12schecurRec = (SS_L_MONTH_SCHEDAY12SCHECURRecord)ds.day12schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day13schecur.size(); i++){
		SS_L_MONTH_SCHEDAY13SCHECURRecord day13schecurRec = (SS_L_MONTH_SCHEDAY13SCHECURRecord)ds.day13schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day14schecur.size(); i++){
		SS_L_MONTH_SCHEDAY14SCHECURRecord day14schecurRec = (SS_L_MONTH_SCHEDAY14SCHECURRecord)ds.day14schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day15schecur.size(); i++){
		SS_L_MONTH_SCHEDAY15SCHECURRecord day15schecurRec = (SS_L_MONTH_SCHEDAY15SCHECURRecord)ds.day15schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day16schecur.size(); i++){
		SS_L_MONTH_SCHEDAY16SCHECURRecord day16schecurRec = (SS_L_MONTH_SCHEDAY16SCHECURRecord)ds.day16schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day17schecur.size(); i++){
		SS_L_MONTH_SCHEDAY17SCHECURRecord day17schecurRec = (SS_L_MONTH_SCHEDAY17SCHECURRecord)ds.day17schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day18schecur.size(); i++){
		SS_L_MONTH_SCHEDAY18SCHECURRecord day18schecurRec = (SS_L_MONTH_SCHEDAY18SCHECURRecord)ds.day18schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day19schecur.size(); i++){
		SS_L_MONTH_SCHEDAY19SCHECURRecord day19schecurRec = (SS_L_MONTH_SCHEDAY19SCHECURRecord)ds.day19schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day20schecur.size(); i++){
		SS_L_MONTH_SCHEDAY20SCHECURRecord day20schecurRec = (SS_L_MONTH_SCHEDAY20SCHECURRecord)ds.day20schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day21schecur.size(); i++){
		SS_L_MONTH_SCHEDAY21SCHECURRecord day21schecurRec = (SS_L_MONTH_SCHEDAY21SCHECURRecord)ds.day21schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day22schecur.size(); i++){
		SS_L_MONTH_SCHEDAY22SCHECURRecord day22schecurRec = (SS_L_MONTH_SCHEDAY22SCHECURRecord)ds.day22schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day23schecur.size(); i++){
		SS_L_MONTH_SCHEDAY23SCHECURRecord day23schecurRec = (SS_L_MONTH_SCHEDAY23SCHECURRecord)ds.day23schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day24schecur.size(); i++){
		SS_L_MONTH_SCHEDAY24SCHECURRecord day24schecurRec = (SS_L_MONTH_SCHEDAY24SCHECURRecord)ds.day24schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day25schecur.size(); i++){
		SS_L_MONTH_SCHEDAY25SCHECURRecord day25schecurRec = (SS_L_MONTH_SCHEDAY25SCHECURRecord)ds.day25schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day26schecur.size(); i++){
		SS_L_MONTH_SCHEDAY26SCHECURRecord day26schecurRec = (SS_L_MONTH_SCHEDAY26SCHECURRecord)ds.day26schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day27schecur.size(); i++){
		SS_L_MONTH_SCHEDAY27SCHECURRecord day27schecurRec = (SS_L_MONTH_SCHEDAY27SCHECURRecord)ds.day27schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day28schecur.size(); i++){
		SS_L_MONTH_SCHEDAY28SCHECURRecord day28schecurRec = (SS_L_MONTH_SCHEDAY28SCHECURRecord)ds.day28schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day29schecur.size(); i++){
		SS_L_MONTH_SCHEDAY29SCHECURRecord day29schecurRec = (SS_L_MONTH_SCHEDAY29SCHECURRecord)ds.day29schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day30schecur.size(); i++){
		SS_L_MONTH_SCHEDAY30SCHECURRecord day30schecurRec = (SS_L_MONTH_SCHEDAY30SCHECURRecord)ds.day30schecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.day31schecur.size(); i++){
		SS_L_MONTH_SCHEDAY31SCHECURRecord day31schecurRec = (SS_L_MONTH_SCHEDAY31SCHECURRecord)ds.day31schecur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDay01schecur()%>
<%= ds.getDay02schecur()%>
<%= ds.getDay03schecur()%>
<%= ds.getDay04schecur()%>
<%= ds.getDay05schecur()%>
<%= ds.getDay06schecur()%>
<%= ds.getDay07schecur()%>
<%= ds.getDay08schecur()%>
<%= ds.getDay09schecur()%>
<%= ds.getDay10schecur()%>
<%= ds.getDay11schecur()%>
<%= ds.getDay12schecur()%>
<%= ds.getDay13schecur()%>
<%= ds.getDay14schecur()%>
<%= ds.getDay15schecur()%>
<%= ds.getDay16schecur()%>
<%= ds.getDay17schecur()%>
<%= ds.getDay18schecur()%>
<%= ds.getDay19schecur()%>
<%= ds.getDay20schecur()%>
<%= ds.getDay21schecur()%>
<%= ds.getDay22schecur()%>
<%= ds.getDay23schecur()%>
<%= ds.getDay24schecur()%>
<%= ds.getDay25schecur()%>
<%= ds.getDay26schecur()%>
<%= ds.getDay27schecur()%>
<%= ds.getDay28schecur()%>
<%= ds.getDay29schecur()%>
<%= ds.getDay30schecur()%>
<%= ds.getDay31schecur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= day01schecurRec.seq%>
<%= day01schecurRec.frdt%>
<%= day01schecurRec.todt%>
<%= day01schecurRec.remk%>
<%= day01schecurRec.schemangunitcd%>
<%= day01schecurRec.schemangunitcd_nm%>
<%= day02schecurRec.seq%>
<%= day02schecurRec.frdt%>
<%= day02schecurRec.todt%>
<%= day02schecurRec.remk%>
<%= day02schecurRec.schemangunitcd%>
<%= day02schecurRec.schemangunitcd_nm%>
<%= day03schecurRec.seq%>
<%= day03schecurRec.frdt%>
<%= day03schecurRec.todt%>
<%= day03schecurRec.remk%>
<%= day03schecurRec.schemangunitcd%>
<%= day03schecurRec.schemangunitcd_nm%>
<%= day04schecurRec.seq%>
<%= day04schecurRec.frdt%>
<%= day04schecurRec.todt%>
<%= day04schecurRec.remk%>
<%= day04schecurRec.schemangunitcd%>
<%= day04schecurRec.schemangunitcd_nm%>
<%= day05schecurRec.seq%>
<%= day05schecurRec.frdt%>
<%= day05schecurRec.todt%>
<%= day05schecurRec.remk%>
<%= day05schecurRec.schemangunitcd%>
<%= day05schecurRec.schemangunitcd_nm%>
<%= day06schecurRec.seq%>
<%= day06schecurRec.frdt%>
<%= day06schecurRec.todt%>
<%= day06schecurRec.remk%>
<%= day06schecurRec.schemangunitcd%>
<%= day06schecurRec.schemangunitcd_nm%>
<%= day07schecurRec.seq%>
<%= day07schecurRec.frdt%>
<%= day07schecurRec.todt%>
<%= day07schecurRec.remk%>
<%= day07schecurRec.schemangunitcd%>
<%= day07schecurRec.schemangunitcd_nm%>
<%= day08schecurRec.seq%>
<%= day08schecurRec.frdt%>
<%= day08schecurRec.todt%>
<%= day08schecurRec.remk%>
<%= day08schecurRec.schemangunitcd%>
<%= day08schecurRec.schemangunitcd_nm%>
<%= day09schecurRec.seq%>
<%= day09schecurRec.frdt%>
<%= day09schecurRec.todt%>
<%= day09schecurRec.remk%>
<%= day09schecurRec.schemangunitcd%>
<%= day09schecurRec.schemangunitcd_nm%>
<%= day10schecurRec.seq%>
<%= day10schecurRec.frdt%>
<%= day10schecurRec.todt%>
<%= day10schecurRec.remk%>
<%= day10schecurRec.schemangunitcd%>
<%= day10schecurRec.schemangunitcd_nm%>
<%= day11schecurRec.seq%>
<%= day11schecurRec.frdt%>
<%= day11schecurRec.todt%>
<%= day11schecurRec.remk%>
<%= day11schecurRec.schemangunitcd%>
<%= day11schecurRec.schemangunitcd_nm%>
<%= day12schecurRec.seq%>
<%= day12schecurRec.frdt%>
<%= day12schecurRec.todt%>
<%= day12schecurRec.remk%>
<%= day12schecurRec.schemangunitcd%>
<%= day12schecurRec.schemangunitcd_nm%>
<%= day13schecurRec.seq%>
<%= day13schecurRec.frdt%>
<%= day13schecurRec.todt%>
<%= day13schecurRec.remk%>
<%= day13schecurRec.schemangunitcd%>
<%= day13schecurRec.schemangunitcd_nm%>
<%= day14schecurRec.seq%>
<%= day14schecurRec.frdt%>
<%= day14schecurRec.todt%>
<%= day14schecurRec.remk%>
<%= day14schecurRec.schemangunitcd%>
<%= day14schecurRec.schemangunitcd_nm%>
<%= day15schecurRec.seq%>
<%= day15schecurRec.frdt%>
<%= day15schecurRec.todt%>
<%= day15schecurRec.remk%>
<%= day15schecurRec.schemangunitcd%>
<%= day15schecurRec.schemangunitcd_nm%>
<%= day16schecurRec.seq%>
<%= day16schecurRec.frdt%>
<%= day16schecurRec.todt%>
<%= day16schecurRec.remk%>
<%= day16schecurRec.schemangunitcd%>
<%= day16schecurRec.schemangunitcd_nm%>
<%= day17schecurRec.seq%>
<%= day17schecurRec.frdt%>
<%= day17schecurRec.todt%>
<%= day17schecurRec.remk%>
<%= day17schecurRec.schemangunitcd%>
<%= day17schecurRec.schemangunitcd_nm%>
<%= day18schecurRec.seq%>
<%= day18schecurRec.frdt%>
<%= day18schecurRec.todt%>
<%= day18schecurRec.remk%>
<%= day18schecurRec.schemangunitcd%>
<%= day18schecurRec.schemangunitcd_nm%>
<%= day19schecurRec.seq%>
<%= day19schecurRec.frdt%>
<%= day19schecurRec.todt%>
<%= day19schecurRec.remk%>
<%= day19schecurRec.schemangunitcd%>
<%= day19schecurRec.schemangunitcd_nm%>
<%= day20schecurRec.seq%>
<%= day20schecurRec.frdt%>
<%= day20schecurRec.todt%>
<%= day20schecurRec.remk%>
<%= day20schecurRec.schemangunitcd%>
<%= day20schecurRec.schemangunitcd_nm%>
<%= day21schecurRec.seq%>
<%= day21schecurRec.frdt%>
<%= day21schecurRec.todt%>
<%= day21schecurRec.remk%>
<%= day21schecurRec.schemangunitcd%>
<%= day21schecurRec.schemangunitcd_nm%>
<%= day22schecurRec.seq%>
<%= day22schecurRec.frdt%>
<%= day22schecurRec.todt%>
<%= day22schecurRec.remk%>
<%= day22schecurRec.schemangunitcd%>
<%= day22schecurRec.schemangunitcd_nm%>
<%= day23schecurRec.seq%>
<%= day23schecurRec.frdt%>
<%= day23schecurRec.todt%>
<%= day23schecurRec.remk%>
<%= day23schecurRec.schemangunitcd%>
<%= day23schecurRec.schemangunitcd_nm%>
<%= day24schecurRec.seq%>
<%= day24schecurRec.frdt%>
<%= day24schecurRec.todt%>
<%= day24schecurRec.remk%>
<%= day24schecurRec.schemangunitcd%>
<%= day24schecurRec.schemangunitcd_nm%>
<%= day25schecurRec.seq%>
<%= day25schecurRec.frdt%>
<%= day25schecurRec.todt%>
<%= day25schecurRec.remk%>
<%= day25schecurRec.schemangunitcd%>
<%= day25schecurRec.schemangunitcd_nm%>
<%= day26schecurRec.seq%>
<%= day26schecurRec.frdt%>
<%= day26schecurRec.todt%>
<%= day26schecurRec.remk%>
<%= day26schecurRec.schemangunitcd%>
<%= day26schecurRec.schemangunitcd_nm%>
<%= day27schecurRec.seq%>
<%= day27schecurRec.frdt%>
<%= day27schecurRec.todt%>
<%= day27schecurRec.remk%>
<%= day27schecurRec.schemangunitcd%>
<%= day27schecurRec.schemangunitcd_nm%>
<%= day28schecurRec.seq%>
<%= day28schecurRec.frdt%>
<%= day28schecurRec.todt%>
<%= day28schecurRec.remk%>
<%= day28schecurRec.schemangunitcd%>
<%= day28schecurRec.schemangunitcd_nm%>
<%= day29schecurRec.seq%>
<%= day29schecurRec.frdt%>
<%= day29schecurRec.todt%>
<%= day29schecurRec.remk%>
<%= day29schecurRec.schemangunitcd%>
<%= day29schecurRec.schemangunitcd_nm%>
<%= day30schecurRec.seq%>
<%= day30schecurRec.frdt%>
<%= day30schecurRec.todt%>
<%= day30schecurRec.remk%>
<%= day30schecurRec.schemangunitcd%>
<%= day30schecurRec.schemangunitcd_nm%>
<%= day31schecurRec.seq%>
<%= day31schecurRec.frdt%>
<%= day31schecurRec.todt%>
<%= day31schecurRec.remk%>
<%= day31schecurRec.schemangunitcd%>
<%= day31schecurRec.schemangunitcd_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 07 14:07:49 KST 2004 */