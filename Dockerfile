FROM python:3.11-slim

WORKDIR /app

RUN pip install --no-cache-dir streamlit

COPY myapp.py .

EXPOSE 8701

CMD ["streamlit", "run", "myapp.py", "--server.port=8701", "server.address=0.0.0.0"]