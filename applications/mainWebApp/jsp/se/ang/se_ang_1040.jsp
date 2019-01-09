<%@	page contentType="text/html; charset=EUC-KR" %>
<!DOCTYPE html>
<html>
<head>
<title>test</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge;">

<!-- UI-GRID -->
<link rel="stylesheet" href="http://ui-grid.info/release/ui-grid.css" type="text/css">
<!-- COMMON -->
<link rel="stylesheet" href="/css/dev/common.css" type="text/css">
<!-- 각각 필요한 CSS -->
<style></style>


<!-- ANGULAR -->
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.0/angular.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.0/angular-touch.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.0/angular-animate.js"></script>
<!-- JQUERY -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- GRID -->
<script src="http://ui-grid.info/docs/grunt-scripts/csv.js"></script>
<script src="http://ui-grid.info/docs/grunt-scripts/pdfmake.js"></script>
<script src="http://ui-grid.info/docs/grunt-scripts/vfs_fonts.js"></script>
<script src="http://ui-grid.info/release/ui-grid.js"></script>    
<!-- EXCEL DOWNLOAD -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/xlsx/0.9.12/xlsx.full.min.js"></script>
<script src="https://fastcdn.org/FileSaver.js/1.1.20151003/FileSaver.min.js"></script>
<script src="/js/dev/se/ang/se_ang_1040_app.js"></script>
<script src="/js/dev/common/ag_excel.js"></script>

<script>
/* 임시 Progress Show/Hide */
function showProgress() {
	var progress = '<div id="progress" style="position:absolute;width:100%;height:100%;opacity:0.3;z-index:100;background:#000;margin:0 auto;text-align:center;"><img src="/html/images/loading.gif" style="position:relative;top:30%;"/></div>';
	$("body").prepend(progress);
}
function hideProgress() {
	$("#progress").remove();
}
</script>

</head>


<body ng-app=1040 ng-controller="ctrl1040">
테스트
<h1 ng-bind="title" class="title"></h1>
<br><hr>
<!-- BEGIN: SEARCH -->
<div>
	<form ng-model="frm1" ng-submit="search()" novalidate>
		<select ng-model="code.bo_cd" ng-change="chg1()">
			<option value="">전체</option>
			<option ng-repeat="x in bo_list" value="{{x.bocd}}">{{x.bonm}}</option>
		</select>
		
		<select id="medi_cd" ng-model="code.medi_cd"" ng-change="chg2()">
			<option value="">전체</option>
			<option ng-repeat="x in medi_list" value="{{x.cd}}">{{x.cdnm}}</option>
		</select>
		
		<select id="clamtmthd_cd" ng-model="code.clamtmthd_cd" ng-change="chg3()">
			<option value="">전체</option>
			<option ng-repeat="x in clamtmthd_list" value="{{x.cd}}">{{x.cdnm}}</option>
		</select>

		<input type="text" ng-model="code.fryymm" value="201701">
		<input type="text" ng-model="code.toyymm" value="201712">
		<button type="submit" class="btn1" id="btn1" ng-model="btn1">조회</button>
		<button type="button" class="btn1" id='toggleFiltering' ng-click="toggleFiltering()">필터</button>
		<button type="button" class="btn1" id='excel' ng-click="excel()">엑셀</button>
		<button type="button" class="btn1" id='instance' ng-click="toggleInstance()">인스턴스</button>
		<button type="button" class="btn1" id='get_rows' ng-click="selectedData()">선택된 자료</button>
	</form>
</div>
<!-- END: SEARCH -->

<hr>
<div>

	<!-- BEGIN: GRID -->
	<strong>TOTAL: {{ totalcnt }} rows</strong>
	<div id="grid1" ui-grid="gridOptions1" class="datagrid" 
		ui-grid-pinning
		ui-grid-move-columns
		ui-grid-resize-columns
		ui-grid-exporter
		ui-grid-grouping
		ui-grid-pagination
		ui-grid-selection
	>
	</div>
	<!--  END: GRID -->

	<!-- BEGIN: DETAIL-- >
	<div style="position:absolute; left:830px; top:175px; width:400px; height:510px; border:1px solid #999999;">
		<br>
		<form ng-model="frm2" method="post" novalidate>
			<span class="caption1">팀:</span>   		<input ng-model="detail.dept_nm" class="w200 readonly" readonly><br>
			<span class="caption1">파트:</span> 		<input ng-model="detail.part_nm" class="w200 readonly" readonly><br>
			<span class="caption1">지역:</span> 		<input ng-model="detail.area_nm" class="w200 readonly" readonly><br>
			<span class="caption1">*센터명:</span> 	<input ng-model="detail.bo_nm"   class="w200 req"><br>
			<span class="caption1">*센터코드:</span> 	<input ng-model="detail.bo_cd"   class="w200 req"><br>
			<span class="caption1">*센터순번:</span> 	<input ng-model="detail.bo_seq"  class="w200 req"><br>
			<span class="caption1">부수:</span> 		<input ng-model="detail.qty"	 class="w200"><br>
			<span class="caption1">단가:</span> 		<input ng-model="detail.uprc"    class="w200"><br>
			<span class="caption1">금액:</span> 		<input ng-model="(detail.qty * detail.uprc)  | number"  class="w200 readonly"><br>
			<span class="caption1">hidden:</span> 	<input type="text" class="w200 readonly" value="{{detail.dept_cd}}, {{detail.part_cd}}, {{detail.area_cd}}" readonly><br>
			<br>
			&nbsp;
			<div style="display:block; width:100%; text-align:center;">
				<button type="button" class="btn2" id="insert" ng-click="insert()">등록</button>
				<button type="button" class="btn2" id="save"   ng-click="update()">수정</button>
				<button type="button" class="btn2" id="delete" ng-click="delete()">삭제</button>
				<button type="button" class="btn2" id="delete" ng-click="init()">초기화</button>
			</div>
		</form>
	</div>
	< !-- END:   DETAIL -->

</div>

<!-- BEGIN: INSTANCE -->
<textarea id="textarea1" style="display:none;">{{result}}</textarea>
<!-- END:   INSTANCE -->

</body>
</html>