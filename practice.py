student = {
    "name": "현빈",
    "score": 70
}

def update_score(student, new_score):
    student["score"] = new_score
    return student

result = update_score(student, 90)

print(result)