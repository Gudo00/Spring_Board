<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="../includes/header.jsp"%>

<h1 class="mt-4">Board List Page</h1>
<ol class="breadcrumb mb-4">
	<li class="breadcrumb-item"><a href="/board/list">목록</a></li>
	<li class="breadcrumb-item active">Static Navigation</li>
</ol>

<div class="card mb-4">
	<div class="card-body">
		<div class="container mt-3">
			<form action="/board/list" method="get">
			<div class="row">
				<div class="col-md-4">
					<select class="form-select" name="type">
						<option value="" ${requestDTO.type == null ?'selected':'' }>----</option>
						<option value="T" ${requestDTO.type =='T' ?'selected':'' }>제목</option>
						<option value="C" ${requestDTO.type =='C' ?'selected':'' }>내용</option>
						<option value="W" ${requestDTO.type =='W' ?'selected':'' }>작성자</option>
						<option value="TC" ${requestDTO.type =='TC' ?'selected':'' }>제목+내용</option>
					</select>
				</div>
				<div class="col-md-6">
					<input type="text" class="form-control" name="keyword"
						placeholder="검색어 입력" value="${requestDTO.keyword}">
				</div>
				<div class="col-md-2">
					<button class="btn btn-primary w-100" type='submit'>검색</button>
				</div>
			</div>
			</form>
		</div>
	</div>
</div>

${res }


<div style="height: 100vh"></div>
<div class="card mb-4">
	<div class="card-body">When scrolling, the navigation stays at
		the top of the page. This is the end of the static navigation demo.</div>
</div>


<!-- 모달 -->
<div class="modal fade" id="myModal" aria-labelledby="modalTitle">

	<div class="modal-dialog">

		<div class="modal-content" inert>
			<div class="modal-header">
				<h5 class="modal-title" id="modalTitle">JavaScript 모달</h5>
				<button type="button" class="btn-close" data-bs-dismiss="modal"
					aria-label="Close"></button>
			</div>
			<div class="modal-body">처리가 완료되었습니다. ${result}</div>

			<div class="modal-footer">
				<button type="button" class="btn btn-secondary"
					data-bs-dismiss="modal">닫기</button>
				<button type="button" id="confirmBtn" class="btn btn-primary">확인</button>
			</div>
		</div>
	</div>
</div>

<script>
	const result = '${result}' //JS가 아니라 JSP의 EL
	const myModal = new bootstrap.Modal(document.getElementById('myModal'));

	if (result) {
		myModal.show()
	}
</script>


<%@include file="../includes/footer.jsp"%>